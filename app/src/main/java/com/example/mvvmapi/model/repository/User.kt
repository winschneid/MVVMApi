package com.example.mvvmapi.model.repository

/**
 * ユーザを表すクラス
 */
data class User(
    val userId: UserId,
    val name: String,
    val avatarImage: NetworkImage,
    val blogUrl: Url,
)
