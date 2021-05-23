package com.android.financiapp.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentSavingBinding
import com.android.financiapp.databinding.FragmentSettingsBinding
import com.android.financiapp.event.Event

class SettingFragment: Fragment() {

    private var binding: FragmentSettingsBinding?= null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        binding?.imgNotification?.setOnClickListener { Event.goToNotification() }
        binding?.imgBack?.setOnClickListener { Event.onTabChanged(0) }
        return binding?.root
    }
}