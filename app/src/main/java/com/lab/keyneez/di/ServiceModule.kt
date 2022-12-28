package com.lab.keyneez.di

import com.lab.keyneez.data.service.ExampleService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Provides
    fun providesAuthService(retrofit: Retrofit): ExampleService =
        retrofit.create(ExampleService::class.java)
}
