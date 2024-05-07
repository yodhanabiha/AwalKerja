package com.nabiha.awalkerja.domain.utils

import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apirequest.RegisterRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse
import kotlinx.coroutines.flow.Flow

interface UseCase
interface ApiUseCaseParams<Params, Type> : UseCase {
    suspend fun execute(params: Params): Flow<Result<Type>>
}
interface ApiUseCaseNonParams<Type> : UseCase {
    suspend fun execute(): Flow<Result<Type>>
}

interface ApiUseCaseAuth : UseCase {
//    suspend fun register(params: ): Flow<Result<ResReg>>
    suspend fun login(params: LoginRequest): Flow<Result<LoginResponse>>
    suspend fun register(params: RegisterRequest): Flow<Result<RegisterResponse>>
}