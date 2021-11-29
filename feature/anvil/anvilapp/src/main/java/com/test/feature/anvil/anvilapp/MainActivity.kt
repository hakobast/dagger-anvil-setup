package com.test.feature.anvil.anvilapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity() {

    @Inject lateinit var worker: ActivityWorker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
