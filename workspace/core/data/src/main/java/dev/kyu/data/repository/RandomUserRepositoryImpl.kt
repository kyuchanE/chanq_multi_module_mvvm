package dev.kyu.data.repository

import dev.kyu.data.api.RandomUserApi
import dev.kyu.domain.model.RandomUserDomainData
import dev.kyu.domain.repository.RandomUserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RandomUserRepositoryImpl @Inject constructor(
    private val randomUserApi: RandomUserApi
): RandomUserRepository {

    override suspend fun getRandomUser(results: Int): Flow<MutableList<RandomUserDomainData>?> = flow {
        val randomUserResponse = randomUserApi.getRandomUser(results)

        when (randomUserResponse.code()) {
            in 200..299 -> {
                emit(
                    randomUserResponse.body()?.toDomain()
                )
            }
        }
    }.flowOn(Dispatchers.IO)

}