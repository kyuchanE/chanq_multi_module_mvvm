package dev.kyu.data.repository.remote.datasource

import dev.kyu.data.remote.model.LotteryResponse
import dev.kyu.domain.utils.RemoteErrorEmitter

interface LotteryDataSource {
    suspend fun getGithub(remoteErrorEmitter: RemoteErrorEmitter, drwNo: String): LotteryResponse?
}