package com.android.financiapp.ui.transaction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.financiapp.BaseFragment
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentTransactionBinding
import com.android.financiapp.event.Event

class TransactionFragment: BaseFragment() {
    private var binding: FragmentTransactionBinding?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentTransactionBinding.inflate(layoutInflater)
        binding?.rvTransaction?.adapter = TransactionAdapter()

        binding?.imgBack?.setOnClickListener {
            Event.onTabChanged(0)
        }
        return binding?.root
    }
}