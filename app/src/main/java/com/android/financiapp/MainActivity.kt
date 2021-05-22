package com.android.financiapp

import android.graphics.PorterDuff
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.android.financiapp.databinding.ActivityMainBinding
import com.android.financiapp.event.Event
import com.android.financiapp.ui.components.ComponentsFragment
import com.android.financiapp.ui.main.MainFragment
import com.android.financiapp.ui.my_card.MyCardFragment
import com.android.financiapp.ui.news.DetailNewsFragment
import com.android.financiapp.ui.news.NewsFragment
import com.android.financiapp.ui.notification.NotificationFragment
import com.android.financiapp.ui.overview.OverviewFragment
import com.android.financiapp.ui.pages.PagesFragment
import com.android.financiapp.ui.saving.SavingFragment
import com.android.financiapp.ui.settings.SettingFragment
import com.android.financiapp.ui.transaction.TransactionFragment
import com.android.financiapp.ui.transaction_detail.TransactionDetailActivity
import com.android.financiapp.ui.verifycation.VerificationFragment
import java.util.*

class MainActivity : BaseActivity() {

    private var binding: ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initEvent()
    }

    private fun initEvent() {
        addFragment(R.id.frMain, MainFragment())
        chooseTab(0)
        binding?.csOverView?.setOnClickListener { chooseTab(0) }
        binding?.csPages?.setOnClickListener { chooseTab(1) }
        binding?.csComponent?.setOnClickListener { chooseTab(2) }
        binding?.csMyCard?.setOnClickListener { chooseTab(3) }
        binding?.csSettings?.setOnClickListener { chooseTab(4) }


    }

    private fun chooseTab(tab: Int) {
        binding?.tvOverView?.setBackgroundResource(if (tab == 0) R.drawable.bg_tab_line else R.color.white)
        binding?.tvOverView2?.setTextColor(ContextCompat.getColor(this, if (tab == 0) R.color.colorMain else R.color.black))

        binding?.tvPages?.setBackgroundResource(if (tab == 1) R.drawable.bg_tab_line else R.color.white)
        binding?.tvPages2?.setTextColor(ContextCompat.getColor(this,if (tab == 1) R.color.colorMain else R.color.black))

        binding?.tvComponents?.setBackgroundResource(if (tab == 2) R.drawable.bg_tab_line else R.color.white)
        binding?.tvComponents2?.setTextColor(ContextCompat.getColor(this,if (tab == 2) R.color.colorMain else R.color.black))

        binding?.tvMyCards?.setBackgroundResource(if (tab == 3) R.drawable.bg_tab_line else R.color.white)
        binding?.tvCard2?.setTextColor(ContextCompat.getColor(this,if (tab == 3) R.color.colorMain else R.color.black))

        binding?.tvSettings?.setBackgroundResource(if (tab == 4) R.drawable.bg_tab_line else R.color.white)
        binding?.tvSetting2?.setTextColor(ContextCompat.getColor(this,if (tab == 4) R.color.colorMain else R.color.black))

        binding?.imgOverView?.setColorFilter(ContextCompat.getColor(this, if(tab == 0) R.color.colorMain else R.color.black), PorterDuff.Mode.MULTIPLY)
        binding?.imgPage?.setColorFilter(ContextCompat.getColor(this, if(tab == 1) R.color.colorMain else R.color.black), PorterDuff.Mode.MULTIPLY)
        binding?.imgComponents?.setColorFilter(ContextCompat.getColor(this, if(tab == 2) R.color.colorMain else R.color.black), PorterDuff.Mode.MULTIPLY)
        binding?.imgCard?.setColorFilter(ContextCompat.getColor(this, if(tab == 3) R.color.colorMain else R.color.black), PorterDuff.Mode.MULTIPLY)
        binding?.imgSetting?.setColorFilter(ContextCompat.getColor(this, if(tab == 4) R.color.colorMain else R.color.black), PorterDuff.Mode.MULTIPLY)


        if(supportFragmentManager.findFragmentById(R.id.frMain) is MainFragment) {

        } else {
            replaceFragment(R.id.frMain, MainFragment())
        }

        Event.onTabChanged(tab)

    }

    class MainPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getItem(position: Int): Fragment {
            val fragment: Fragment
            when(position) {
                0-> {
                    fragment = OverviewFragment()
                }

                1-> {
                    fragment = PagesFragment()
                }

                2-> {
                    fragment = TransactionFragment()
                }

                3-> {
                    fragment = MyCardFragment()
                }

                else -> {
                    fragment = SettingFragment()
                }
            }

            return fragment
        }


        override fun getCount(): Int {
            return 5
        }
    }

    override fun onEventReceive(it: Map<String, Any?>) {
        super.onEventReceive(it)

        it[Event.VIEWPAGER_CHANGED]?.let {
            chooseTab(it as Int)
        }

        it[Event.VIEW_ALL_TRANSACTION]?.let {
            addFragment(R.id.frMain, TransactionFragment())
        }

        it[Event.GO_DETAIL_TRANSACTION]?.let {
            addFragment(R.id.frMain, TransactionDetailActivity())
        }

        it[Event.GO_ALL_SAVING]?.let {
            addFragment(R.id.frMain, SavingFragment())
        }

        it[Event.GO_TO_NOTIFICATION]?.let {
            addFragment(R.id.frMain, NotificationFragment())
        }

        it[Event.GOTO_NEWS_FRAGMENT]?.let {
            addFragment(R.id.frMain, NewsFragment())
        }

        it[Event.GOTO_NEWS_DETAIL]?.let {
            addFragment(R.id.frMain, DetailNewsFragment())
        }

        it[Event.GOTO_VERIFICATION]?.let {
            addFragment(R.id.frMain, VerificationFragment())
        }
    }

    override fun onBackPressed() {
        if(supportFragmentManager.findFragmentById(R.id.frMain) is MainFragment) {
            finish()
        } else {
            supportFragmentManager.popBackStack()
        }
    }
}