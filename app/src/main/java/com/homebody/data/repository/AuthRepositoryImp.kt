package com.homebody.data.repository

import com.homebody.data.api.AuthApi
import com.homebody.data.api.LoginRequest
import com.homebody.data.models.toUser
import com.homebody.domain.models.User
import com.homebody.domain.repository.AuthRepository

class AuthRepositoryImp(private val authApi: AuthApi) : AuthRepository {
    override suspend fun login(email: String, password: String): Result<User> =
        authApi.login(LoginRequest(email, password)).map { it.toUser() }

}