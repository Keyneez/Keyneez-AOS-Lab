package com.lab.keyneez.presentation.card

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lab.keyneez.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
    }
}
