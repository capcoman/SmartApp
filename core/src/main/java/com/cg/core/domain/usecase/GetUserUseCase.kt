package com.cg.core.domain.usecase

import com.cg.core.data.service.UsersRepo
import com.cg.core.data.service.items.UserItem
import com.cg.core.domain.BaseUseCase
import com.cg.core.domain.BaseUseCase.None
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val usersRepo: UsersRepo
) : BaseUseCase<UserItem, None>() {

    override suspend fun run(params: None) =
        usersRepo.getUser()
}