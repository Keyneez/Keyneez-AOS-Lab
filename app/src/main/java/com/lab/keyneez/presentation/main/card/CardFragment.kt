package com.lab.keyneez.presentation.main.card

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentCardBinding
import com.lab.keyneez.presentation.verification.VerificationActivity
import com.lab.keyneez.util.binding.BindingFragment
import com.lab.keyneez.util.extension.setOnSingleClickListener

class CardFragment : BindingFragment<FragmentCardBinding>(R.layout.fragment_card) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initIssueBtnClickListener()
    }

    private fun initIssueBtnClickListener() {
        binding.btnCardIssue.setOnSingleClickListener {
            val toVerification = Intent(activity, VerificationActivity::class.java)
            startActivity(toVerification)
        }
    }

    companion object {
        fun newInstance(): CardFragment {
            return CardFragment()
        }
    }
}
