package com.cg.core.data.service

import com.cg.core.data.Either
import com.cg.core.data.Either.Left
import com.cg.core.data.Either.Right
import com.cg.core.data.Failure
import retrofit2.Call

class UsersRepo(
    apiClient: ApiClient
) {

    val service: UsersService by lazy {
        apiClient.retrofit.create(UsersService::class.java)
    }

    fun getUser() = request(
        service.getUser()
    ) { it.toItem() }

    private fun <T, R> request(
        call: Call<T>,
        transform: (T) -> R
    ): Either<Failure, R> {

        return try {

            val response = call.execute()

            when (response.isSuccessful) {

                true -> {

                    response.body()?.let { body ->
                        return Right(
                            transform(
                                (body)
                            )
                        )
                    }

                    Left(Failure.ServerError)
                }

                false -> Left(Failure.ServerError)
            }
        } catch (exception: Throwable) {
            Left(Failure.ServerError)
        }
    }
}