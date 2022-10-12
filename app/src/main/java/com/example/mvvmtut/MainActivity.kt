package com.example.mvvmtut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {

    private val getData = GetData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(getData)
        if (lifecycle.currentState==Lifecycle.State.INITIALIZED)
            println("INITIALIZED")
    }

    override fun onResume() {
        if (lifecycle.currentState==Lifecycle.State.STARTED)
            println("STARTED")
        super.onResume()
    }
}

