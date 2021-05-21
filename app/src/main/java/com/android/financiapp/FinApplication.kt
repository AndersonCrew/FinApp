package com.android.financiapp

import android.app.Application
import io.reactivex.rxjava3.subjects.PublishSubject

class FinApplication: Application() {
    companion object {
        private var instance: FinApplication?= null
        val eventBus: PublishSubject<HashMap<String, Any?>> = PublishSubject.create()
        @JvmStatic
        fun getInstance(): FinApplication {
            if(instance == null) {
                instance = FinApplication()
            }
            return instance!!
        }
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}