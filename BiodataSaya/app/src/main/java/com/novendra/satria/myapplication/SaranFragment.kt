package com.novendra.satria.myapplication


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_saran.*

/**
 * A simple [Fragment] subclass.
 */
class SaranFragment : Fragment() {
    lateinit var  nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nav = Navigation.findNavController(view)
        buttonSubmit.setOnClickListener{
            if (editText.text.toString().isNotEmpty()){
                val input:String = editText.text.toString()
                val bundle = Bundle()
                bundle.putString("args", input)
                nav.navigate(R.id.action_saranFragment_to_hasilSaranFragment,bundle)
            }
        }

    }


}
