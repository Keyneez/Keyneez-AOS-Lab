package com.lab.keyneez.presentation.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.lab.keyneez.R
import com.lab.keyneez.databinding.ActivityMainBinding
import com.lab.keyneez.presentation.main.card.CardFragment
import com.lab.keyneez.presentation.main.home.HomeFragment
import com.lab.keyneez.presentation.main.like.LikeFragment
import com.lab.keyneez.presentation.main.setting.SettingFragment
import com.lab.keyneez.util.binding.BindingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initBottomNavigationBar()
    }

    private fun initBottomNavigationBar() {
        // 초기 프래그먼트 설정
        val currentFragment = supportFragmentManager.findFragmentById(R.id.container_main)
        if (currentFragment == null) navigateTo<HomeFragment>()

        // 메뉴 클릭 시 프래그먼트 전환
        binding.botNavMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> navigateTo<HomeFragment>()
                R.id.menu_like -> navigateTo<LikeFragment>()
                R.id.menu_card -> navigateTo<CardFragment>()
                R.id.menu_setting -> navigateTo<SettingFragment>()
            }
            true
        }
    }

    private inline fun <reified T : Fragment> navigateTo() {
        supportFragmentManager.commit {
            replace<T>(R.id.container_main, T::class.java.canonicalName)
        }
    }
}
