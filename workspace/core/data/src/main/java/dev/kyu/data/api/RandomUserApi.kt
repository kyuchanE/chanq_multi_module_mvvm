package dev.kyu.data.api

import dev.kyu.data.model.RandomUserResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {

    @GET("api")
    suspend fun getRandomUser(
        @Query("results") results: Int
    ): Response<RandomUserResponse>

}