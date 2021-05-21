package com.android.financiapp.ui.transaction_detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.financiapp.BaseFragment
import com.android.financiapp.R
import com.android.financiapp.databinding.ActivityTransactionDetailBinding

class TransactionDetailActivity : BaseFragment() {

    private var binding: ActivityTransactionDetailBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityTransactionDetailBinding.inflate(layoutInflater)
        binding?.imgBask?.setOnClickListener { requireActivity().onBackPressed() }
        return binding?.root
    }
}