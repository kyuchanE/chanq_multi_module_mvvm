package dev.kyu.domain.usecase.user

import dev.kyu.domain.model.RandomUserDomainData
import dev.kyu.domain.repository.RandomUserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetRandomUserUseCase @Inject constructor(
    private val randomUserRepository: RandomUserRepository
) {

    suspend fun getRandomUserInfo(cntUser: Int): Flow<MutableList<RandomUserDomainData>?> =
        randomUserRepository.getRandomUser(cntUser)
}