package com.android.financiapp.ui.my_card

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentMycardBinding
import com.android.financiapp.event.Event

class MyCardFragment : Fragment() {

    private var binding: FragmentMycardBinding?= null


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMycardBinding.inflate(inflater, container, false)
        binding?.rvCard?.adapter = CardAdapter()

        binding?.vGone?.setOnClickListener {  binding?.csAddCard?.visibility = View.GONE }
        binding?.btnAdd?.setOnClickListener {  binding?.csAddCard?.visibility = View.VISIBLE }
        binding?.imgBack?.setOnClickListener { Event.onTabChanged(0) }

        return binding?.root
    }
}