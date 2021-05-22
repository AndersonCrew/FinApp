package com.android.financiapp.ui.verifycation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.financiapp.BaseFragment
import com.android.financiapp.databinding.FragmentVerificationBinding

class VerificationFragment : BaseFragment(){
    private var binding: FragmentVerificationBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVerificationBinding.inflate(inflater, container, false)
        binding?.imgBack?.setOnClickListener { requireActivity().onBackPressed() }
        return binding?.root
    }

}