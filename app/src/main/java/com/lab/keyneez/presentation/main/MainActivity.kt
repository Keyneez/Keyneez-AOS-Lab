package com.lab.keyneez.presentation.main

import android.os.Bundle
import com.lab.keyneez.R
import com.lab.keyneez.databinding.ActivityMainBinding
import com.lab.keyneez.util.binding.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
