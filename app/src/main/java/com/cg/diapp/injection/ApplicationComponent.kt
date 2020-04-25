package com.cg.diapp.injection

import com.cg.core.injection.CoreModule
import com.cg.diapp.ui.HomeFragment
import com.cg.diapp.ui.MainActivity
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        ViewModelModule::class,
        CoreModule::class]
)
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @ExperimentalCoroutinesApi
    fun inject(homeFragment: HomeFragment)
}