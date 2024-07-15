package dev.kyu.lottery.api

import dev.kyu.data.api.LotteryApi
import dev.kyu.data.model.LotteryResponse
import retrofit2.Response

class LotteryApiTestFail: LotteryApi {

    override suspend fun getLotteryNum(method: String, drwNo: String): Response<LotteryResponse> {
        return Response.error(401, null)
    }
}