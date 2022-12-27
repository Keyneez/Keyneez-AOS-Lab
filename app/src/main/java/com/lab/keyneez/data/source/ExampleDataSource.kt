package com.lab.keyneez.data.source

import com.lab.keyneez.data.model.request.ExampleRequestDto
import com.lab.keyneez.data.model.response.ExampleResponseDto
import com.lab.keyneez.data.model.response.wrapper.BaseResponse
import com.lab.keyneez.data.service.ExampleService
import javax.inject.Inject

class ExampleDataSource @Inject constructor(
    private val exampleService: ExampleService
) {
    suspend fun postExample(exampleRequestDto: ExampleRequestDto): BaseResponse<ExampleResponseDto> =
        exampleService.postExample(exampleRequestDto)
}
