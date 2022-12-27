package com.lab.keyneez.data.respository

import com.lab.keyneez.data.model.request.ExampleRequestDto
import com.lab.keyneez.data.model.response.ExampleResponseDto
import com.lab.keyneez.data.model.response.wrapper.BaseResponse
import com.lab.keyneez.data.source.ExampleDataSource
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val exampleDataSource: ExampleDataSource
) : ExampleRepository {
    override suspend fun postExample(exampleRequestDto: ExampleRequestDto): Result<BaseResponse<ExampleResponseDto>> =
        kotlin.runCatching { exampleDataSource.postExample(exampleRequestDto) }
}