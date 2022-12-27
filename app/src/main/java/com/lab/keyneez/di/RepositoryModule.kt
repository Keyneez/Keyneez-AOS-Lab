package com.lab.keyneez.di

import com.lab.keyneez.data.respository.ExampleRepository
import com.lab.keyneez.data.respository.ExampleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun providesExampleRepository(
        authRepositoryImpl: ExampleRepositoryImpl
    ): ExampleRepository
}