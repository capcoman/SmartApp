package com.cg.diapp.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.cg.core.data.Failure
import com.cg.core.data.service.items.UserItem
import com.cg.core.domain.BaseUseCase.None
import com.cg.core.domain.usecase.GetUserUseCase
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

@ExperimentalCoroutinesApi
class HomeFragmentViewModel @Inject constructor() : BaseViewModel() {

    @Inject
    lateinit var getUserUseCase: GetUserUseCase

    var user: MutableLiveData<UserItem> = MutableLiveData()

    fun getUser() {

        getUserUseCase(None()) {
            it.fold(::handleFailure, ::handleUser)
        }

    }

    private fun handleUser(user: UserItem) {
        this.user.postValue(user)
    }

    private fun handleFailure(failure: Failure) {
        Log.e("response", "fail")
    }
}