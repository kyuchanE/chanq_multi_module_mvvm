package dev.kyu.domain.repository

import dev.kyu.domain.model.LotteryResponse
import dev.kyu.domain.utils.RemoteErrorEmitter

interface LotteryRepository {
    suspend fun getGithub(remoteErrorEmitter: RemoteErrorEmitter, drwNo: String): LotteryResponse?
}