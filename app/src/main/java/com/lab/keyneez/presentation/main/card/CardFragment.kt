package com.lab.keyneez.presentation.main.card

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentCardBinding
import com.lab.keyneez.util.binding.BindingFragment

class CardFragment : BindingFragment<FragmentCardBinding>(R.layout.fragment_card) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): CardFragment {
            return CardFragment()
        }
    }
}
