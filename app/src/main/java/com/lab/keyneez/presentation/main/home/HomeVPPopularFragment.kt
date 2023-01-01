package com.lab.keyneez.presentation.main.home

import android.os.Bundle
import android.view.View
import com.lab.keyneez.R
import com.lab.keyneez.databinding.FragmentHomePopularBinding
import com.lab.keyneez.util.binding.BindingFragment

class HomeVPPopularFragment :
    BindingFragment<FragmentHomePopularBinding>(R.layout.fragment_home_popular) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): HomeVPPopularFragment {
            return HomeVPPopularFragment()
        }
    }
}
