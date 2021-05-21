package com.android.financiapp.ui.saving

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.financiapp.BaseFragment
import com.android.financiapp.databinding.FragmentSavingBinding

class SavingFragment: BaseFragment() {
    private var binding: FragmentSavingBinding?= null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSavingBinding.inflate(layoutInflater)
        binding?.rvSavings?.adapter = SavingAdapter()
        binding?.vGone?.setOnClickListener {  binding?.csAddGoal?.visibility = View.GONE }
        binding?.btnAdd?.setOnClickListener {  binding?.csAddGoal?.visibility = View.VISIBLE }
        binding?.imgBack?.setOnClickListener { requireActivity().onBackPressed() }
        return binding?.root
    }

}