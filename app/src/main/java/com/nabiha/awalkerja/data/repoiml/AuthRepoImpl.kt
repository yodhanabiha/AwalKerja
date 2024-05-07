package com.nabiha.awalkerja.data.repoiml

import com.nabiha.awalkerja.data.apiservice.ApiService
import com.nabiha.awalkerja.data.mapper.auth.LoginMapper
import com.nabiha.awalkerja.data.mapper.auth.RegisterMapper
import com.nabiha.awalkerja.data.utils.NetworkBoundResource
import com.nabiha.awalkerja.data.utils.mapFromApiResponse
import com.nabiha.awalkerja.domain.repository.AuthRepository
import com.nabiha.awalkerja.domain.utils.Result
import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apirequest.RegisterRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val networkBoundResources: NetworkBoundResource,
    private val loginMapper: LoginMapper,
    private val registerMapper: RegisterMapper
) : AuthRepository {
    override suspend fun fetchLoginUser(params: LoginRequest): Flow<Result<LoginResponse>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchLoginUser(params)
            }, loginMapper
        )
    }

    override suspend fun fetchRegisterUser(params: RegisterRequest): Flow<Result<RegisterResponse>> {
        return mapFromApiResponse(
            result = networkBoundResources.downloadData {
                apiService.fetchRegisterUser(params)
            }, registerMapper
        )
    }

}