package com.example.mvvmapi.model.repository

import com.example.mvvmapi.model.remode_data_source.GitHubUser
import com.example.mvvmapi.model.remode_data_source.RemoteDataSource
import javax.inject.Inject

/**
 * [UserRepository]の実装クラス
 */
class UserRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : UserRepository {
    override suspend fun getUser(userName: String): User {
        return remoteDataSource.getGitHubUser(userName = userName).toUser()
    }
}

private fun GitHubUser.toUser() : User {
    return User(
        userId = UserId(value = id),
        name = name,
        avatarImage = NetworkImage(url = Url(value = avatarUrl)),
        blogUrl = Url(value = blog)
    )
}