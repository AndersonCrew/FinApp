package com.android.financiapp.ui.overview

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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
            binding?.drawerLayout?.openDrawer(GravityCompat.START)
        }

        binding?.imgClose?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
        }

        binding?.rvMyCards?.adapter = CardAdapter()

        binding?.tvViewAllTransaction?.setOnClickListener {
            Event.onTabChanged(2)
        }

        binding?.csAmazon?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csAlex?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csBeatriz?.setOnClickListener { Event.goToDetailTransaction() }
        binding?.csApple?.setOnClickListener { Event.goToDetailTransaction() }

        binding?.cardWithdraw?.setOnClickListener { binding?.csWithdraw?.visibility = View.VISIBLE }
        binding?.vGoneWithdraw?.setOnClickListener { binding?.csWithdraw?.visibility = View.GONE }

        binding?.cardDepositAdd?.setOnClickListener { binding?.csDeposit?.visibility = View.VISIBLE }
        binding?.vGoneDeposit?.setOnClickListener { binding?.csDeposit?.visibility = View.GONE }

        binding?.cardSend?.setOnClickListener { binding?.csSend?.visibility = View.VISIBLE }
        binding?.vGoneSend?.setOnClickListener { binding?.csSend?.visibility = View.GONE }

        binding?.viewAllSaving?.setOnClickListener { Event.goToAllSaving() }

        binding?.rvSavingGoal?.adapter = BaseAdapter(R.layout.item_saving, 3)
        binding?.rvSendMoney?.adapter = BaseAdapter(R.layout.item_send_money, 20)
        binding?.rvMonthlyBill?.adapter = BaseAdapter(R.layout.item_money_bills, 10)
        binding?.rvLastedNews?.adapter = BaseAdapter(R.layout.item_news, 10)
        binding?.imgNotification?.setOnClickListener { Event.goToNotification() }
        binding?.tvViewAllNews?.setOnClickListener { Event.goToNewsFragment() }

        binding?.tvOverViewClick?.setOnClickListener { binding?.drawerLayout?.closeDrawer(GravityCompat.START) }
        binding?.tvPageClick?.setOnClickListener { Event.onTabChanged(1) }
        binding?.tvComponentClick?.setOnClickListener { Event.onTabChanged(2) }
        binding?.tvCardClick?.setOnClickListener { Event.onTabChanged(3) }
        binding?.tvSettingClick?.setOnClickListener { Event.onTabChanged(4) }
        binding?.cardMyCard?.setOnClickListener { Event.onTabChanged(3) }
        binding?.viewAllMyCard?.setOnClickListener { Event.onTabChanged(3) }


        binding?.navView?.findViewById<ImageView>(R.id.imgDeposit)?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            Handler(Looper.getMainLooper()).postDelayed({
                binding?.csDeposit?.visibility = View.VISIBLE
            }, 500)
        }

        binding?.tvnapTien?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            Handler(Looper.getMainLooper()).postDelayed({
                binding?.csDeposit?.visibility = View.VISIBLE
            }, 500)
        }

        binding?.imgWithdraw?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            Handler(Looper.getMainLooper()).postDelayed({
                binding?.csWithdraw?.visibility = View.VISIBLE
            }, 500)
        }

        binding?.tvRutTien?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            Handler(Looper.getMainLooper()).postDelayed({
                binding?.csWithdraw?.visibility = View.VISIBLE
            }, 500)
        }

        binding?.imgSend?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            binding?.csSend?.visibility = View.VISIBLE
        }

        binding?.tvGui?.setOnClickListener {
            binding?.drawerLayout?.closeDrawer(GravityCompat.START)
            binding?.csSend?.visibility = View.VISIBLE
        }

        binding?.imgMyCards?.setOnClickListener {
            Event.onTabChanged(3)
        }

        binding?.tvTheCuaToi?.setOnClickListener {
            Event.onTabChanged(3)
        }

    }
}