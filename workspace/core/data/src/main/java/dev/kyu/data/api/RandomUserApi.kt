package dev.kyu.data.api

import dev.kyu.data.model.RandomUserResponse
import dev.kyu.data.utils.NetworkConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApi {

    @GET(NetworkConfig.randomUserApi)
    suspend fun getRandomUser(
        @Query("results") results: Int
    ): Response<RandomUserResponse>

}