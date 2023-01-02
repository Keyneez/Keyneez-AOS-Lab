package com.lab.keyneez.presentation.main.home

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentHomeRecommendBinding
import com.lab.keyneez.util.binding.BindingFragment

class RecommendInfoFragment :
    BindingFragment<FragmentHomeRecommendBinding>(R.layout.fragment_home_recommend) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): RecommendInfoFragment {
            return RecommendInfoFragment()
        }
    }
}
