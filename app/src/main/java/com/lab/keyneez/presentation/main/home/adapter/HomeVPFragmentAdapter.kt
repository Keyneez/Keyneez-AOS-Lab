package com.lab.keyneez.presentation.main.home.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.lab.keyneez.presentation.main.home.HomeVPNewFragment
import com.lab.keyneez.presentation.main.home.HomeVPPopularFragment
import com.lab.keyneez.presentation.main.home.HomeVPRecommendFragment

class HomeVPFragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HomeVPRecommendFragment()
            1 -> return HomeVPPopularFragment()
            2 -> return HomeVPNewFragment()
        }
        return HomeVPRecommendFragment()
    }
}
