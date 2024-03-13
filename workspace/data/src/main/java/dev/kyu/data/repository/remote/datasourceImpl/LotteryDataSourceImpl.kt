package dev.kyu.data.repository.remote.datasourceImpl

import dev.kyu.data.remote.api.LotteryApi
import dev.kyu.data.remote.model.LotteryResponse
import dev.kyu.data.repository.remote.datasource.LotteryDataSource
import dev.kyu.data.utils.base.BaseRepository
import dev.kyu.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class LotteryDataSourceImpl @Inject constructor(
    private val lotteryApi: LotteryApi
) : BaseRepository(), LotteryDataSource {
    override suspend fun getGithub(
        remoteErrorEmitter: RemoteErrorEmitter,
        drwNo: String
    ): LotteryResponse? =
        safeApiCall(remoteErrorEmitter) { lotteryApi.getLotteryNum("getLottoNumber", drwNo).body() }

}