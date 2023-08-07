package com.homebody.data.api

import com.homebody.data.models.UserModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {
    @POST("auth/user_login")
    suspend fun login(@Body loginRequest: LoginRequest): Result<UserModel>

    @POST("auth/forgot_password")
    suspend fun forgotPassword(@Body email: String):Any

}

@Serializable
data class LoginRequest(
    @SerialName("userName")
    val userName: String,
    @SerialName("password")
    val password: String,
    @SerialName("key")
    val key: String? = null,
    @SerialName("is_from_hb_app")
    val fromApp: Int = 1,
)