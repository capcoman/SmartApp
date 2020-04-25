package com.cg.diapp.injection

import com.cg.diapp.ui.MainActivity
import dagger.Module

@Module
interface ApplicationModule {

    fun injectActivity(activity: MainActivity)
}