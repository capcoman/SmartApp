package com.cg.core.data.service.items

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("data") val data: UserData
) {

    fun toItem() =
        UserItem(
            name = data.name,
            lastName = data.lastName,
            avatarUrl = data.avatarUrl
        )

    class UserData(
        @SerializedName("first_name") val name: String,
        @SerializedName("last_name") val lastName: String,
        @SerializedName("avatar") val avatarUrl: String
    )

}

