package com.lab.keyneez.presentation.main.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lab.keyneez.presentation.main.home.NewInfoFragment
import com.lab.keyneez.presentation.main.home.PopularInfoFragment
import com.lab.keyneez.presentation.main.home.RecommendInfoFragment

class HomeVPFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return RecommendInfoFragment()
            1 -> return PopularInfoFragment()
            2 -> return NewInfoFragment()
        }
        return RecommendInfoFragment()
    }
}
