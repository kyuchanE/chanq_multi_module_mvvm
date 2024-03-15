package dev.kyu.domain.usecase.lottery

import dev.kyu.domain.model.LotteryData
import dev.kyu.domain.repository.LotteryRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetLotteryRepoUseCase @Inject constructor(
    private val lotteryRepository: LotteryRepository
) {

    suspend operator fun invoke(drwNo: String): Flow<LotteryData?> =
        lotteryRepository.getLottery(drwNo)

}