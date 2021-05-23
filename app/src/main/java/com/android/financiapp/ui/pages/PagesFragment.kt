package com.android.financiapp.ui.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentPagesBinding
import com.android.financiapp.event.Event

class PagesFragment : Fragment() {

    private var binding: FragmentPagesBinding?= null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagesBinding.inflate(inflater, container, false)
        binding?.imgBack?.setOnClickListener { Event.onTabChanged(0) }
        return binding?.root
    }
}