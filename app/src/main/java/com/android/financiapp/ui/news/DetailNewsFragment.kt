package com.android.financiapp.ui.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.financiapp.BaseFragment
import com.android.financiapp.databinding.FragmentDetailNewsBinding

class DetailNewsFragment: BaseFragment() {
    private var binding: FragmentDetailNewsBinding?= null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailNewsBinding.inflate(layoutInflater)
        binding?.imgBack?.setOnClickListener { requireActivity().onBackPressed() }
        return binding?.root
    }
}