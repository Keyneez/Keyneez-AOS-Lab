package com.lab.keyneez.data.model.response.wrapper

import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    val statusCode: Int,
    val success: Boolean,
    val message: String,
    val data: T?
)
