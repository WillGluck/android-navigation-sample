package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireView().findViewById<Button>(R.id.botao_qualquer).setOnClickListener{
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToAnotherActivityGraph())
        }
        requireView().findViewById<Button>(R.id.botao_qualquer2).setOnClickListener{
            val intent = Intent(requireContext(), AnotherActivity::class.java)
            startActivity(intent)
        }
    }

}