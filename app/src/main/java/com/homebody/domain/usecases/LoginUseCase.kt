package com.homebody.domain.usecases

import com.homebody.domain.models.User
import com.homebody.domain.repository.AuthRepository
import org.koin.core.annotation.Factory

@Factory
class LoginUseCase(private val authRepository: AuthRepository) {
    suspend operator fun invoke(email: String, password: String): Result<User> =
        authRepository.login(email, password)
}