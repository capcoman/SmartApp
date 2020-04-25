package com.cg.diapp.injection

import com.cg.diapp.injection.ApplicationComponent

interface ApplicationComponentProvider {
    fun getApplicaitonComponent(): ApplicationComponent
}