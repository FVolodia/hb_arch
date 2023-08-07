package com.homebody.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

//TODO update once see fill response
@Serializable
data class UserModel(
    @SerialName("name")
    val name: String)