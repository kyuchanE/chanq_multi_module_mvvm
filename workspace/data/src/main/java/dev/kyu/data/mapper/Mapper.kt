package dev.kyu.data.mapper

import dev.kyu.data.remote.model.LotteryResponse

object Mapper {
    fun mapperLottery(response: LotteryResponse?): dev.kyu.domain.model.LotteryResponse? {
        return response?.toDomain()
    }

    fun LotteryResponse.toDomain(): dev.kyu.domain.model.LotteryResponse =
        dev.kyu.domain.model.LotteryResponse(
            this.returnValue,
            this.drwNoDate,
            this.drwNo,
            this.drwtNo1,
            this.drwtNo2,
            this.drwtNo3,
            this.drwtNo4,
            this.drwtNo5,
            this.drwtNo6
        )
}