package dev.kyu.lottery

import app.cash.turbine.test
import dev.kyu.data.api.LotteryApi
import dev.kyu.data.repository.LotteryRepositoryImpl
import dev.kyu.domain.usecase.lottery.GetLotteryRepoUseCase
import dev.kyu.lottery.api.LotteryApiTestFail
import dev.kyu.lottery.api.LotteryApiTestSucceed
import dev.kyu.lottery.rule.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
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
        lotteryApi = LotteryApiTestSucceed()
//        lotteryApi = LotteryApiTestFail()
        lotteryRepository = LotteryRepositoryImpl(lotteryApi)
        getLotteryRepoUseCase = GetLotteryRepoUseCase(lotteryRepository)
        viewModel = LotteryViewModel(getLotteryRepoUseCase)
    }

    @Test
    fun `when succeeded getLotteryRepo expect loadingState changed false true false`() = runTest {
        viewModel.loadingState.test {
            viewModel.getLotteryRepo("test")

            assertEquals(false, awaitItem())
            assertEquals(true, awaitItem())
            assertEquals(false, awaitItem())
        }
    }

    @Test
    fun `when succeeded getLotteryRepo expect returnValue kyu`() = runTest {
        viewModel.getLotteryRepo("test")

        viewModel.lotteryRepo.test {
            assertEquals("kyu", awaitItem().returnValue)
        }
    }

    @Test
    fun `when failed getLotteryRepo expect loadingState changed false true false`() = runTest {
        viewModel.loadingState.test {
            viewModel.getLotteryRepo("test")

            assertEquals(false, awaitItem())
            assertEquals(true, awaitItem())
            assertEquals(false, awaitItem())
        }
    }

    @Test
    fun test() = runTest {

    }

}