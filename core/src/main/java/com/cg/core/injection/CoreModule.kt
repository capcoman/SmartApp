package com.cg.core.injection

import com.cg.core.data.service.ApiClient
import com.cg.core.data.service.UsersRepo
import com.cg.core.domain.usecase.GetUserUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {

    @Provides
    @Singleton
    fun userUseCase(usersRepo: UsersRepo) =
        GetUserUseCase(usersRepo)

    @Provides
    @Singleton
    fun usersRepo(apiClient: ApiClient) =
        UsersRepo(apiClient)

    @Provides
    @Singleton
    fun apiClient() = ApiClient()

}