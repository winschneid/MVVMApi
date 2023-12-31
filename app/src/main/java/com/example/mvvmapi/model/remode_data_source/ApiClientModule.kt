package com.example.mvvmapi.model.remode_data_source

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import javax.inject.Singleton

/**
 * [ApiClient]のModule
 */
@Module
@InstallIn(SingletonComponent::class)
class ApiClientModule {

    /**
     * [ApiClient]のDIに用いられるインスタンスを生成する
     */
    @ExperimentalSerializationApi
    @Provides
    @Singleton
    fun provideApiClient(apiClientProvider: ApiClientProvider) : ApiClient {
        return apiClientProvider.provide()
    }
}