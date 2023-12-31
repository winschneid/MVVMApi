package com.example.mvvmapi.model.repository

/**
 * [User]のRepository
 */
interface UserRepository {
    /**
     * [userName]に該当する[User]を返す
     */
    suspend fun getUser(userName: String): User
}