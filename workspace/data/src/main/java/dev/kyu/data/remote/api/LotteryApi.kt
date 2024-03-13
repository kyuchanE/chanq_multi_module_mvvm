package dev.kyu.data.remote.api

import com.google.gson.JsonObject
import dev.kyu.data.remote.model.LotteryResponse
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