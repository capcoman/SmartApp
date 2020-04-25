package com.cg.core.data.service

import com.cg.core.data.service.items.UserResponse
import retrofit2.Call
import retrofit2.http.GET

interface UsersService {

    @GET("users/2")
    fun getUser(): Call<UserResponse>
}