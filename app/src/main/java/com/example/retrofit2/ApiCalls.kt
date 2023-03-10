package com.example.retrofit2

import retrofit2.Call

class ApiCalls(private val apiInterface: ApiInterface) {
    val heros: Call<List<GetRequestModel?>?>?
        get() = apiInterface.heros

    fun postHeros(postRequestModel: PostRequestModel?): Call<PostResponseModel?>? {
        return apiInterface.postHeros(postRequestModel)
    }
}