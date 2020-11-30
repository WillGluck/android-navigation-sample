package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FirstFragment : Fragment() {

    private val args: FirstFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.va_para_acao_global).setOnClickListener{
            requireView().findNavController().navigate(MainGraphDirections.actionGlobalAnotherGraph())
        }
        view.findViewById<TextView>(R.id.texto).apply {
            text = args.texto
            visibility = if (args.exibeMensagem) View.VISIBLE else View.GONE
        }
    }

}