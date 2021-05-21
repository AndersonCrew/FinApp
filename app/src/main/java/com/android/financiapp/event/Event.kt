package com.android.financiapp.event

import com.android.financiapp.FinApplication


object Event {
    const val VIEWPAGER_CHANGED = "VIEWPAGER_CHANGED"
    const val ON_TAB_CHANGED = "ON_TAB_CHANGED"
    const val VIEW_ALL_TRANSACTION = "VIEW_ALL_TRANSACTION"
    const val BACK_TO_MAIN = "BACK_TO_MAIN"
    const val GO_DETAIL_TRANSACTION = "GO_DETAIL_TRANSACTION"
    const val GO_ALL_SAVING = "GO_ALL_SAVING"
    const val GO_TO_NOTIFICATION = "GO_TO_NOTIFICATION"
    const val GOTO_NEWS_FRAGMENT = "GOTO_NEWS_FRAGMENT"
    const val GOTO_NEWS_DETAIL = "GOTO_NEWS_DETAIL"



    fun onViewPagerChanged(position: Int) {
        FinApplication.eventBus.onNext(hashMapOf(VIEWPAGER_CHANGED to position))
    }

    fun onTabChanged(position: Int) {
        FinApplication.eventBus.onNext(hashMapOf(ON_TAB_CHANGED to position))
    }

    fun viewAllTransaction() {
        FinApplication.eventBus.onNext(hashMapOf(VIEW_ALL_TRANSACTION to ""))
    }

    fun goToDetailTransaction() {
        FinApplication.eventBus.onNext(hashMapOf(GO_DETAIL_TRANSACTION to ""))
    }

    fun goToAllSaving() {
        FinApplication.eventBus.onNext(hashMapOf(GO_ALL_SAVING to ""))
    }

    fun goToNotification() {
        FinApplication.eventBus.onNext(hashMapOf(GO_TO_NOTIFICATION to ""))
    }

    fun goToNewsFragment() {
        FinApplication.eventBus.onNext(hashMapOf(GOTO_NEWS_FRAGMENT to ""))
    }

    fun goToNewsDetail() {
        FinApplication.eventBus.onNext(hashMapOf(GOTO_NEWS_DETAIL to ""))
    }
}