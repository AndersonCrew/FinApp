package com.android.financiapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.android.financiapp.BaseFragment
import com.android.financiapp.MainActivity
import com.android.financiapp.databinding.FragmentMainBinding
import com.android.financiapp.event.Event

class MainFragment: BaseFragment() {
    private var binding: FragmentMainBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        initEvents()
        return binding?.root
    }

    private fun initEvents() {
        binding?.vpMain?.adapter = MainActivity.MainPagerAdapter(requireActivity().supportFragmentManager)

        binding?.vpMain?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
              Event.onViewPagerChanged(position)
            }

        })
    }


    override fun onEventReceive(it: Map<String, Any?>) {
        super.onEventReceive(it)

        it[Event.ON_TAB_CHANGED]?.let {
            val position = it as Int
            if(binding?.vpMain?.currentItem != position) {
                binding?.vpMain?.currentItem = position
            }
        }
    }
}