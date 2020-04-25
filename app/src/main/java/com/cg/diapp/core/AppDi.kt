package com.cg.diapp.core

import android.app.Application
import com.cg.core.injection.CoreModule

class AppDi : Application(),
    ApplicationComponentProvider {

    private val coreModule: CoreModule by lazy {
        CoreModule(application = this)
    }

    override fun getApplicaitonComponent(): ApplicationComponent {
        return DaggerApplicationComponent
            .builder()
            .build()
    }


}