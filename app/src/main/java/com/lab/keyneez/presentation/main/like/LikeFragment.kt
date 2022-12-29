package com.lab.keyneez.presentation.main.like

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentLikeBinding
import com.lab.keyneez.util.binding.BindingFragment

class LikeFragment : BindingFragment<FragmentLikeBinding>(R.layout.fragment_like) {
    private var _binding: FragmentLikeBinding? = null
        get() = requireNotNull(_binding) { "binding value is null." }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // 여기서 코드 작성
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance(): LikeFragment {
            return LikeFragment()
        }
    }
}
