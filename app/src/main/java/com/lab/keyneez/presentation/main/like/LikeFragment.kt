package com.lab.keyneez.presentation.main.like

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentLikeBinding
import com.lab.keyneez.util.binding.BindingFragment

class LikeFragment : BindingFragment<FragmentLikeBinding>(R.layout.fragment_like) {
    // newinstance() 사용하기
    private val likeViewModel by viewModels<LikeViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        // 여기서 코드 작성
    }

    private fun initAdapter() {
    }

    companion object {
        fun newInstance(): LikeFragment {
            return LikeFragment()
        }
    }
}
