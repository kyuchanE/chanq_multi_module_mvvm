package dev.kyu.data.repository

import dev.kyu.data.mapper.Mapper
import dev.kyu.data.repository.remote.datasource.LotteryDataSource
import dev.kyu.domain.model.LotteryResponse
import dev.kyu.domain.repository.LotteryRepository
import dev.kyu.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class LotteryRepositoryImpl @Inject constructor(
    private val lotteryDataSource: LotteryDataSource
): LotteryRepository {
    override suspend fun getGithub(
        remoteErrorEmitter: RemoteErrorEmitter,
        drwNo: String
    ): LotteryResponse? =
        Mapper.mapperLottery(lotteryDataSource.getGithub(remoteErrorEmitter, drwNo))
}