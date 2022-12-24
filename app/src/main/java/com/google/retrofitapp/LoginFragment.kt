package com.google.retrofitapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.retrofitapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding : FragmentLoginBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)
        binding.btnPost.setOnClickListener {
            val password = "123"
            if (binding.inputPassword.text.toString().equals("123")) {
                findNavController().navigate(R.id.action_loginFragment_to_rootFragment2)
            }
        }
    }
}