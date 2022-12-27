package com.lab.keyneez.data.service

import com.lab.keyneez.data.model.request.ExampleRequestDto
import com.lab.keyneez.data.model.response.ExampleResponseDto
import com.lab.keyneez.data.model.response.wrapper.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ExampleService {
    // 예시 API
    @POST("api/example")
    suspend fun postExample(
        @Body request: ExampleRequestDto
    ): BaseResponse<ExampleResponseDto>
}
