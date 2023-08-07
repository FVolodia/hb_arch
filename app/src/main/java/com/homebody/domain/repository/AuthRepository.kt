package com.homebody.domain.repository

import com.homebody.domain.models.User

interface AuthRepository {
    suspend fun login(email: String, password: String): Result<User>
}