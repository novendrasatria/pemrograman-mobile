package com.novendra.satria.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hasil_saran.*
import kotlinx.android.synthetic.main.fragment_tampilan.*

/**
 * A simple [Fragment] subclass.
 */
class HasilSaranFragment : Fragment() {
    lateinit var  nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hasil_saran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val hasilFragment:String? = arguments?.getString( "args")

        textHasilSaran.text = hasilFragment
        nav = Navigation.findNavController(view)

        buttonKeluar.setOnClickListener {
            nav.navigate(R.id.action_hasilSaranFragment_to_penutupFragment)
        }
    }

}
