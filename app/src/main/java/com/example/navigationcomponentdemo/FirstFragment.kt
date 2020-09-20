package com.example.navigationcomponentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationcomponentdemo.model.User
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

       view.btn_send.setOnClickListener {
         //   val valuePass = FirstFragmentDirections.navToSecondFragment(12)
           val firstName = view.edt_firstName.text.toString()
           val lastName = view.edt_lastName.text.toString()
           val user = User(firstName, lastName)
           val action = FirstFragmentDirections.navToSecondFragment(user)
           Navigation.findNavController(view).navigate(action)
        }
        return view
    }
}
