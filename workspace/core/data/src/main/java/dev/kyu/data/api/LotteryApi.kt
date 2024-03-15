package dev.kyu.data.api

import dev.kyu.data.model.LotteryResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LotteryApi {
    @GET("common.do")
    suspend fun getLotteryNum(
        @Query("method") method: String,
        @Query("drwNo") drwNo: String,
    ): Response<LotteryResponse>
}