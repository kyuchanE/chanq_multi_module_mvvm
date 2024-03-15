package dev.kyu.domain.repository

import dev.kyu.domain.model.RandomUserDomainData
import kotlinx.coroutines.flow.Flow

interface RandomUserRepository {
    suspend fun getRandomUser(results: Int): Flow<MutableList<RandomUserDomainData>?>
}