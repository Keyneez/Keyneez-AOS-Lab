package com.lab.keyneez.data.model.request

import kotlinx.serialization.Serializable

@Serializable
data class ExampleRequestDto(
    val id: String,
    val pwd: String
)
