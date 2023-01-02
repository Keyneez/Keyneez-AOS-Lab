package com.lab.keyneez.presentation.main.like

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.lab.keyneez.R
import com.lab.keyneez.data.entity.LikeData
import com.lab.keyneez.databinding.FragmentLikeBinding
import com.lab.keyneez.util.binding.BindingFragment

class LikeFragment : BindingFragment<FragmentLikeBinding>(R.layout.fragment_like) {
    // newinstance() 사용하기
    // private val likeViewModel by viewModels<LikeViewModel>()
    lateinit var likeAdapter: LikeAdapter
    val data = mutableListOf<LikeData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLikeAdapter()
        initLikeClickListener()
        binding.btnLikeSearch.setOnClickListener {
            // 검색화면으로 이동
        }
    }

    private fun initLikeClickListener() {
        binding.btnLikeSave.setOnClickListener {
            binding.rvLikeContent.smoothScrollToPosition(0)
        }
    }

    private fun initLikeAdapter() {
        likeAdapter = LikeAdapter()
        binding.rvLikeContent.adapter = likeAdapter
        binding.rvLikeContent.layoutManager = GridLayoutManager(activity, 2)
        data.apply {
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "12.4.12-10",
                    title = "청소년 영화관 할인"
                )
            )
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "12.11-12.17",
                    title = "청소년 미술관 할인"
                )
            )
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "12.18-12.24",
                    title = "청소년 공연장 할인"
                )
            )
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "12.25-12.31",
                    title = "청소년 박물관 할인"
                )
            )
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "1.1-1.7",
                    title = "청소년 서점 할인"
                )
            )
            add(
                LikeData(
                    background = R.drawable.img_like_background,
                    date = "1.8-1.14",
                    title = "청소년 강의 할인"
                )
            )

            likeAdapter.data = data
            likeAdapter.notifyDataSetChanged()
        }
    }

    companion object {
        fun newInstance(): LikeFragment {
            return LikeFragment()
        }
    }
}
