package com.cg.diapp.core

import com.cg.diapp.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = []
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}