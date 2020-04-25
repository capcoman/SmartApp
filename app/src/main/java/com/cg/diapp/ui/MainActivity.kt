@file:Suppress("EXPERIMENTAL_API_USAGE")

package com.cg.diapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cg.core.data.service.UsersRepo
import com.cg.diapp.R
import com.cg.diapp.core.AppDi
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var usersRepo: UsersRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as AppDi)
            .getApplicaitonComponent()
            .inject(this)

        setContentView(R.layout.activity_main)

    }
}
