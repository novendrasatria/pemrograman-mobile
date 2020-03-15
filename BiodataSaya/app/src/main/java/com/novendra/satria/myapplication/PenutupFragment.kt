package com.novendra.satria.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_penutup.*
import kotlinx.android.synthetic.main.fragment_utama.*

/**
 * A simple [Fragment] subclass.
 */
class PenutupFragment : Fragment() {
    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_penutup, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav = Navigation.findNavController(view)
        buttonKembali.setOnClickListener {
            nav.navigate(R.id.action_penutupFragment_to_utamaFragment)
        }
    }


}
