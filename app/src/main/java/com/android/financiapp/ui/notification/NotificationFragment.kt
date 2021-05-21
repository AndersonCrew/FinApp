package com.android.financiapp.ui.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.financiapp.BaseFragment
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentNotificationBinding
import com.android.financiapp.ui.send_money.BaseAdapter

class NotificationFragment: BaseFragment() {
    private var binding: FragmentNotificationBinding?= null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        binding?.imgBack?.setOnClickListener { requireActivity().onBackPressed() }
        binding?.rvNotification?.adapter = BaseAdapter(R.layout.item_notification, 10)
        return binding?.root
    }
}