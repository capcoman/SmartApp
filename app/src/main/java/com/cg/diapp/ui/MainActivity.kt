package com.cg.diapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cg.diapp.R
import com.cg.diapp.core.AppDi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as AppDi)
            .getApplicaitonComponent()
            .inject(this)

        setContentView(R.layout.activity_main)
    }
}
