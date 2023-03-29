package com.sukajee.dlscore.ui

import com.sukajee.dlscore.data.repository.BaseRepository
import com.sukajee.dlscore.data.repository.TestRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@ExperimentalCoroutinesApi
class DlsViewModelTest {

    @ExperimentalCoroutinesApi
    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private val repository: BaseRepository = TestRepository()
    private lateinit var viewModel: DlsViewModel

    @Before
    fun setup() {
        viewModel = DlsViewModel(repository)
    }

    @Test
    fun `all fields are entered, should calculate the score without issue`() = runTest {

        var currentUiState = viewModel.uiState.value
        viewModel.apply {
            advanceUntilIdle()
            updateTeamARun("310")
            updateTeamAWickets("6")
            updateTeamBOvers("44")
            updateTeamBWickets("6")
            updateMaxOvers("50")

            calculate()
        }
        currentUiState = viewModel.uiState.value
        assertEquals(260, currentUiState.targetRunForTeamB)
        assertFalse(viewModel.uiState.value.shouldDisplayMissingValueError)
    }

    @Test
    fun `all fields are entered and reset clicked, all fields should be empty`() = runTest {

        var currentUiState = viewModel.uiState.value
        viewModel.apply {
            advanceUntilIdle()
            updateTeamARun("15")
            updateTeamAWickets("2")
            updateTeamBOvers("5.4")
            updateTeamBWickets("3")
            updateMaxOvers("38")

            reset()
        }
        currentUiState = viewModel.uiState.value
        assertTrue(currentUiState.targetRunForTeamB == -0)
    }

    @Test
    fun `overs are entered in whole overs`() = runTest {

        var currentUiState = viewModel.uiState.value
        viewModel.apply {
            advanceUntilIdle()
            updateTeamARun("155")
            updateTeamAWickets("2")
            updateTeamBOvers("34")
            updateTeamBWickets("3")
            updateMaxOvers("50")

            calculate()
        }
        currentUiState = viewModel.uiState.value
        assertEquals(90, currentUiState.targetRunForTeamB)
    }

    @Test
    fun `overs are entered with balls and maxOver balls are less than team B balls`() = runTest {

        var currentUiState = viewModel.uiState.value
        viewModel.apply {
            advanceUntilIdle()
            updateTeamARun("155")
            updateTeamAWickets("2")
            updateTeamBOvers("34.3")
            updateTeamBWickets("3")
            updateMaxOvers("50.0")

            calculate()
        }
        currentUiState = viewModel.uiState.value
        assertEquals(91, currentUiState.targetRunForTeamB)
    }

    @Test
    fun `all fields are empty, should trigger an error message`() = runTest {

        var currentUiState = viewModel.uiState.value
        viewModel.apply {
            advanceUntilIdle()
            updateTeamARun("")
            updateTeamAWickets("")
            updateTeamBOvers("")
            updateTeamBWickets("")
            updateMaxOvers("")

            calculate()
        }
        currentUiState = viewModel.uiState.value
        assertTrue(currentUiState.shouldDisplayMissingValueError)
    }
}
