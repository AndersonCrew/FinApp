package com.android.financiapp.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.financiapp.BaseFragment
import com.android.financiapp.databinding.FragmentNewsBinding
import com.android.financiapp.event.Event

class NewsFragment: BaseFragment() {
    private var binding: FragmentNewsBinding?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNewsBinding.inflate(layoutInflater)
        binding?.imgBack?.setOnClickListener { requireActivity()?.onBackPressed() }
        binding?.card1?.setOnClickListener { Event.goToNewsDetail() }
        binding?.card2?.setOnClickListener { Event.goToNewsDetail() }
        binding?.card3?.setOnClickListener { Event.goToNewsDetail() }
        binding?.card4?.setOnClickListener { Event.goToNewsDetail() }
        binding?.card5?.setOnClickListener { Event.goToNewsDetail() }
        binding?.card6?.setOnClickListener { Event.goToNewsDetail() }
        return binding?.root
    }
}