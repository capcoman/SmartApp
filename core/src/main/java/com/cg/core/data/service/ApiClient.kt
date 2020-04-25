package com.cg.core.data.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    //region VARIABLES

    companion object {

        const val ENDPOINT =
            "https://reqres.in/api/"

    }

    var retrofit: Retrofit

    //endregion

    //region BASE

    init {
        retrofit = Retrofit.Builder()
            .baseUrl(ENDPOINT)
            .client(makeOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun makeOkHttpClient(isDebug: Boolean = true): OkHttpClient {
        val okHttpClientBuilder: OkHttpClient.Builder = OkHttpClient.Builder()
        val loggingInterceptor =
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BASIC)
        okHttpClientBuilder.addInterceptor(loggingInterceptor)
        return okHttpClientBuilder.build()
    }

}