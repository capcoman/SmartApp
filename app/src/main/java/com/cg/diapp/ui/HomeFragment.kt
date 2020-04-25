package com.cg.diapp.ui

import android.os.Bundle
import com.cg.core.data.service.items.UserItem
import com.cg.diapp.R
import com.cg.diapp.extension.observe
import com.cg.diapp.extension.viewModel
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
class HomeFragment : BaseFragment() {

    private lateinit var viewModel: HomeFragmentViewModel

    override fun layoutId() = R.layout.fragment_home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appComponent.inject(this)

        viewModel = viewModel(viewModelFactory) {

            observe(user, ::updateUser)
        }

    }

    override fun initViews() {

        viewModel.getUser()
    }

    private fun updateUser(user: UserItem) {
        textViewUser.text = user.toString()
    }


}