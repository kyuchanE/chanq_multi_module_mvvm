package dev.kyu.data

import dev.kyu.data.model.LotteryResponse

object FakeLotteryResponse {

    fun getFakeData(): LotteryResponse =
        LotteryResponse(
            returnValue = "success",
            drwNoDate = "1994-11-13",
            drwNo = 0,
            drwtNo1 = 111,
            drwtNo2 = 222,
            drwtNo3 = 333,
            drwtNo4 = 444,
            drwtNo5 = 555,
            drwtNo6 = 666,
        )
}
