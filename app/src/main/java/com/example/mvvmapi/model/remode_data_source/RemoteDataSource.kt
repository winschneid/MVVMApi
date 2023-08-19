package com.example.mvvmapi.model.remode_data_source

/**
 * サーバからのレスポンスを取り出すDataSource
 */
interface RemoteDataSource {

    /**
     * サーバからのレスポンスを[GitHubUser]として返す
     */
    suspend fun getGitHubUser(userName: String) : GitHubUser
}