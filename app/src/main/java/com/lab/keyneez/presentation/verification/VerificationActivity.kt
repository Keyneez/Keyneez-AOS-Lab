package com.lab.keyneez.presentation.verification

import android.os.Bundle
import com.lab.keyneez.R
import com.lab.keyneez.databinding.ActivityVerificationBinding
import com.lab.keyneez.util.binding.BindingActivity
import com.lab.keyneez.util.extension.setOnSingleClickListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class VerificationActivity :
    BindingActivity<ActivityVerificationBinding>(R.layout.activity_verification) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBackBtnClickListener()
        initStartCameraBtnClickListener()
    }

    private fun initBackBtnClickListener() {
        binding.btnVerificationBack.setOnSingleClickListener { finish() }
    }

    private fun initStartCameraBtnClickListener() {
        // ocr 기능 구현
    }
}
