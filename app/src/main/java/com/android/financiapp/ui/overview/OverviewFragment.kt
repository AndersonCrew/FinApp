package com.android.financiapp.ui.overview

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.android.financiapp.R
import com.android.financiapp.databinding.FragmentOverviewBinding
import com.android.financiapp.event.Event
import com.android.financiapp.ui.my_card.CardAdapter
import com.android.financiapp.ui.send_money.BaseAdapter

class OverviewFragment: Fragment() {
    private var binding: FragmentOverviewBinding?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentOverviewBinding.inflate(layoutInflater)
        initEvents()
        return binding?.root
    }

    private fun initEvents() {
        binding?.imgSlide?.setOnClickListener {
            if(binding?.drawerLayout?.isDrawerOpen(GravityCompat.START) == true) {
                binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            } else {
                binding?.drawerLayout?.openDrawer(GravityCompat.START)
            }
        }

        binding?.imgClose?.setOnClickListener {
            binding?.drawerLayout?.openDrawer(GravityCompat.START)
        }

        binding?.rvMyCards?.adapter = CardAdapter()

        binding?.tvViewAllTransaction?.setOnClickListener {
            Event.viewAllTransaction()
        }

        binding?.csAmazon?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csAlex?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csBeatriz?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csApple?.setOnClickListener { Event.goToDetailTransaction() }

        binding?.card11?.setOnClickListener { binding?.csWithdraw?.visibility = View.VISIBLE }
        binding?.vGoneWithdraw?.setOnClickListener { binding?.csWithdraw?.visibility = View.GONE }

        binding?.cardDeposit?.setOnClickListener { binding?.csDeposit?.visibility = View.VISIBLE }
        binding?.vGoneDeposit?.setOnClickListener { binding?.csDeposit?.visibility = View.GONE }

        binding?.viewAllSaving?.setOnClickListener { Event.goToAllSaving() }

        binding?.rvSavingGoal?.adapter = BaseAdapter(R.layout.item_saving, 3)
        binding?.rvSendMoney?.adapter = BaseAdapter(R.layout.item_send_money, 20)
        binding?.rvMonthlyBill?.adapter = BaseAdapter(R.layout.item_money_bills, 10)
        binding?.rvLastedNews?.adapter = BaseAdapter(R.layout.item_news, 10)
        binding?.imgNotification?.setOnClickListener { Event.goToNotification() }
        binding?.tvViewAllNews?.setOnClickListener { Event.goToNewsFragment() }

    }
}