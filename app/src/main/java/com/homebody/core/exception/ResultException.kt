package com.homebody.core.exception

data class ResultException(
    override val cause: Throwable
) : AppException(cause.message)