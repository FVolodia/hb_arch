package com.homebody.data.models

import com.homebody.domain.models.User

fun UserModel.toUser() = User(name)