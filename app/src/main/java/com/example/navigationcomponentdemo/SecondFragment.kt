package com.example.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment : Fragment() {

    val valueReceive: SecondFragmentArgs by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val myNumber = valueReceive.number
        view.tv_fragmentTwo.text = myNumber.toString()
        view.btn_fragmentTwo.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navToFirstFragment)
        }
        return view
    }
}
