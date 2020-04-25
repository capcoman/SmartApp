package com.cg.diapp.core

import android.app.Application
import com.cg.diapp.injection.ApplicationComponent
import com.cg.diapp.injection.ApplicationComponentProvider
import com.cg.diapp.injection.DaggerApplicationComponent

class AppDi : Application(),
    ApplicationComponentProvider {

    override fun getApplicaitonComponent(): ApplicationComponent {
        return DaggerApplicationComponent
            .builder()
            .build()
    }

}