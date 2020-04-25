package com.cg.core.data.service.items

class UserItem(
    val name: String,
    val lastName: String,
    val avatarUrl: String
) {
    override fun toString(): String {
        return "$name $lastName"
    }
}