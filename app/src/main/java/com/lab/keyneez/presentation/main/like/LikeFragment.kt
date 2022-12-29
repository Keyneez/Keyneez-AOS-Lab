package com.lab.keyneez.presentation.main.like

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentLikeBinding
import com.lab.keyneez.util.binding.BindingFragment

class LikeFragment : BindingFragment<FragmentLikeBinding>(R.layout.fragment_like) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): LikeFragment {
            return LikeFragment()
        }
    }
}
