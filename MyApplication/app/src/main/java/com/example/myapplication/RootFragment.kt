package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RootFragment : Fragment() {

    private val goToFirstFragment by lazy {
        arguments?.getBoolean("GO_TO_FIRST")?:true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_root, container, false)
    }


    override fun onResume() {
        super.onResume()
        GlobalScope.launch {
            delay(2000)
            val direction = if (goToFirstFragment)
                RootFragmentDirections.actionRootFragmentToFirstFragment("Eu que chamei", exibeMensagem = true)
            else
                RootFragmentDirections.actionRootFragmentToSecondFragment()
            findNavController().navigate(direction)
        }

    }

}