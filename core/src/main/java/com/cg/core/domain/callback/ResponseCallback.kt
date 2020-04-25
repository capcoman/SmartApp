package com.cg.core.domain.callback

interface ResponseCallback<T> {

    fun onResponseSuccess(response: T)

    fun onResponseError(throwable: Throwable)

    //may be implemented if needed
    //fun onAuthError()

}