package dev.kyu.data.repository

import dev.kyu.data.api.LotteryApi
import dev.kyu.data.api.LotteryTestApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Test
import com.google.common.truth.Truth.assertThat
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.test.runTest

class LotteryRepositoryImplTest {

    private lateinit var lotteryRepositoryImpl: LotteryRepositoryImpl
    private lateinit var lotteryApi: LotteryApi

    @Before
    fun setUp() {
        lotteryApi = LotteryTestApi()
        lotteryRepositoryImpl = LotteryRepositoryImpl(lotteryApi)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun getLottery_DefaultValue_True() {
        runTest {
            lotteryRepositoryImpl.getLottery("test").collectLatest {
                it?.let {
                    assertThat(it.drwtNo1).isEqualTo(111)
                }
            }
        }
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun getLottery_DefaultValue_False() {
        runTest {
            lotteryRepositoryImpl.getLottery("test").collectLatest {
                it?.let {
                    assertThat(it.drwtNo1).isEqualTo(444)
                }
            }
        }
    }


}