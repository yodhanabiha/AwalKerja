package com.nabiha.awalkerja.data.apiservice

import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apirequest.RegisterRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    //user endpoint
//    @GET("/users/account/profile")
//    suspend fun fetchProfile(
//        @HeaderMap headers : Map<String, String>
//    ):Response<UserApiResponse>
//
    @POST("/users/login")
    @Headers("Accept: application/json")
    suspend fun fetchLoginUser(
        @Body data: LoginRequest
    ): Response<LoginResponse>

    @POST("/users/register")
    @Headers("Accept: application/json")
    suspend fun fetchRegisterUser(
        @Body data: RegisterRequest
    ): Response<RegisterResponse>
}