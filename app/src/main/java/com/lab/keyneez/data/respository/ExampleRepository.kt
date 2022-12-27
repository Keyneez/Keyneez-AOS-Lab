package com.lab.keyneez.data.respository

import com.lab.keyneez.data.model.request.ExampleRequestDto
import com.lab.keyneez.data.model.response.ExampleResponseDto
import com.lab.keyneez.data.model.response.wrapper.BaseResponse

interface ExampleRepository {
    suspend fun postExample(exampleRequestDto: ExampleRequestDto): Result<BaseResponse<ExampleResponseDto>>
}
