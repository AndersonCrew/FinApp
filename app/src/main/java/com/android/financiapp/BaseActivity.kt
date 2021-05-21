package com.android.financiapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.kotlin.addTo
import io.reactivex.rxjava3.schedulers.Schedulers


abstract class BaseActivity : AppCompatActivity() {
    var eventDisposable: CompositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        FinApplication.eventBus
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { onEventReceive(it) }
            .addTo(eventDisposable)

    }

    open fun onEventReceive(it: Map<String, Any?>) {

    }

    fun replaceFragment(resId: Int, fragment: BaseFragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(resId, fragment)
        transaction.commit()
    }

    fun addFragment(resId: Int, fragment: BaseFragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.add(resId, fragment)
        transaction.addToBackStack(fragment::class.simpleName)
        transaction.commit()
    }
}