package com.nabiha.awalkerja.common.di

import com.nabiha.awalkerja.data.repoiml.AuthRepoImpl
import com.nabiha.awalkerja.domain.repository.AuthRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AuthModule {
    @Binds
    fun bindUserRepository(authRepoImpl: AuthRepoImpl): AuthRepository
}