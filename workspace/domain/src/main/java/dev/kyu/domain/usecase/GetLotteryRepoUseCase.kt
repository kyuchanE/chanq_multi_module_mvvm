package dev.kyu.domain.usecase

import dev.kyu.domain.repository.LotteryRepository
import dev.kyu.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

class GetLotteryRepoUseCase @Inject constructor(
    private val lotteryRepository: LotteryRepository
) {
    suspend fun execute(remoteErrorEmitter: RemoteErrorEmitter, drwNo: String) = lotteryRepository.getGithub(remoteErrorEmitter, drwNo)
}