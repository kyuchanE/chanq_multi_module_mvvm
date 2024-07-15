package dev.kyu.lottery.api

import dev.kyu.data.api.LotteryApi
import dev.kyu.data.model.LotteryResponse
import dev.kyu.lottery.FakeLotteryResponse
import retrofit2.Response

class LotteryApiTestSucceed: LotteryApi {

    override suspend fun getLotteryNum(method: String, drwNo: String): Response<LotteryResponse> {
        val fakeData: LotteryResponse = FakeLotteryResponse.getFakeData()
        return Response.success(fakeData)
    }

}