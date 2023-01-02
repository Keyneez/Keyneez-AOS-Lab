package com.lab.keyneez.presentation.main.home

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentHomeNewBinding
import com.lab.keyneez.util.binding.BindingFragment

class NewInfoFragment : BindingFragment<FragmentHomeNewBinding>(R.layout.fragment_home_new) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): NewInfoFragment {
            return NewInfoFragment()
        }
    }
}
