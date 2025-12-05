package com.karslan.cmpmemecreator

import android.app.Application
import com.karslan.cmpmemecreator.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MemeCreatorApplication)
        }
    }
}