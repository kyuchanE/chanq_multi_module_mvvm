package dev.kyu.domain.repository

import dev.kyu.domain.model.LotteryData
import kotlinx.coroutines.flow.Flow

interface LotteryRepository {
    fun getLottery(drwNo: String): Flow<LotteryData?>
}