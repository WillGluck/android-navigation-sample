package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val navController = findNavController(R.id.nav_host_fragment)
        navController.setGraph(
            R.navigation.another_activity_graph,
            intent.extras
        )
    }
}