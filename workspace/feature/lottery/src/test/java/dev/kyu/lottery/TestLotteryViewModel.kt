package dev.kyu.lottery

import com.google.common.truth.Truth.assertThat
import dev.kyu.data.api.LotteryApi
import dev.kyu.data.api.LotteryTestApi
import dev.kyu.data.repository.LotteryRepositoryImpl
import dev.kyu.domain.usecase.lottery.GetLotteryRepoUseCase
import dev.kyu.lottery.rule.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.hamcrest.core.IsEqual
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class TestLotteryViewModel {

    private lateinit var viewModel: LotteryViewModel
    private lateinit var lotteryRepository: LotteryRepositoryImpl
    private lateinit var lotteryApi: LotteryApi
    private lateinit var getLotteryRepoUseCase: GetLotteryRepoUseCase

    @OptIn(ExperimentalCoroutinesApi::class)
    @get: Rule
    val coroutineRule = TestCoroutineRule()

    @Before
    fun setUp() {
        lotteryApi = LotteryTestApi()
        lotteryRepository = LotteryRepositoryImpl(lotteryApi)
        getLotteryRepoUseCase = GetLotteryRepoUseCase(lotteryRepository)
        viewModel = LotteryViewModel(getLotteryRepoUseCase)
    }

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun test() = runTest {

        viewModel.getLotteryRepo("test")

        val result = viewModel.loadingState.take(2).toList()
        val firstResult = result.first()
        val lastResult = result.last()

        assertThat(firstResult).isEqualTo(false)
        assertThat(lastResult).isEqualTo(true)

    }
}