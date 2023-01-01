package com.lab.keyneez.presentation.verification

import android.content.Intent
import android.os.Bundle
import com.lab.keyneez.R
import com.lab.keyneez.databinding.ActivityVerificationBinding
import com.lab.keyneez.presentation.preview.PreviewActivity
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
        val toPreview = Intent(this, PreviewActivity::class.java)
        startActivity(toPreview)
    }
}
