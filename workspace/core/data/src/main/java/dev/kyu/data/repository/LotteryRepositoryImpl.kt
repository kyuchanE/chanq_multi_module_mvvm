package dev.kyu.data.repository

import dev.kyu.data.api.LotteryApi
import dev.kyu.domain.model.LotteryData
import dev.kyu.domain.repository.LotteryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class LotteryRepositoryImpl @Inject constructor(
    private val lotteryApi: LotteryApi
): LotteryRepository {

    override suspend fun getLottery(
        drwNo: String
    ): Flow<LotteryData?> = flow {
        val lotteryResponse = lotteryApi.getLotteryNum("getLottoNumber", drwNo)

        when (lotteryResponse.code()) {
            in 200..299 -> emit(lotteryResponse.body()?.toDomain())
        }
    }


}