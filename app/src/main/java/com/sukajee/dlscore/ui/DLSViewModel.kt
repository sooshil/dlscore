package com.sukajee.dlscore.ui

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sukajee.dlscore.data.models.ResourcesResponse
import com.sukajee.dlscore.data.repository.BaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.math.ceil

private const val TAG = "DLSViewModel"

@HiltViewModel
class DLSViewModel @Inject constructor(
    private val repository: BaseRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DlsUiState())
    val uiState
        get() = _uiState.asStateFlow()

    var data: ResourcesResponse? = null

    var teamARun by mutableStateOf("")
        private set
    var teamAWickets by mutableStateOf("")
        private set
    var teamBOvers by mutableStateOf("")
        private set
    var teamBWickets by mutableStateOf("")
        private set
    var maxOvers by mutableStateOf("")
        private set

    init {
        viewModelScope.launch {
            data = repository.getData()
            Log.d(TAG, "data is $data")
        }
    }

    fun updateTeamARun(run: String) {
        teamARun = run
        removeError()
    }

    fun updateTeamAWickets(wickets: String) {
        teamAWickets = wickets
        removeError()
    }

    fun updateTeamBOvers(overs: String) {
        teamBOvers = overs
        removeError()
    }

    fun updateTeamBWickets(wickets: String) {
        teamBWickets = wickets
        removeError()
    }

    fun updateMaxOvers(overs: String) {
        maxOvers = overs
        removeError()
    }

    private fun removeError() {
        _uiState.update { currentState ->
            currentState.copy(
                shouldDisplayMissingValueError = false
            )
        }
    }

    fun reset() {
        teamARun = ""
        teamAWickets = ""
        teamBOvers = ""
        teamBWickets = ""
        maxOvers = ""
        _uiState.value = DlsUiState(
            targetRunForTeamB = -0
        )
    }

    fun calculate() {
        if (teamARun.isEmpty() || teamAWickets.isEmpty() || teamBOvers.isEmpty() ||
            teamBWickets.isEmpty() || maxOvers.isEmpty()
        ) {
            _uiState.update { currentState ->
                currentState.copy(
                    shouldDisplayMissingValueError = true
                )
            }
            return
        }
        val oversOnlyFromMaxOvers = maxOvers.toDouble().toInt()
        val ballsOnlyFromMaxOvers =
            ((maxOvers.toDouble() - oversOnlyFromMaxOvers).round(1)).times(10)
        val oversOnlyFromBOvers = teamBOvers.toDouble().toInt()
        val ballsOnlyFromBOvers = ((teamBOvers.toDouble() - oversOnlyFromBOvers).round(1)).times(10)

        val ballsOnlyLeftForBOvers = if (ballsOnlyFromMaxOvers < ballsOnlyFromBOvers) {
            ballsOnlyFromMaxOvers + 6 - ballsOnlyFromBOvers
        } else {
            ballsOnlyFromMaxOvers - ballsOnlyFromBOvers
        }
        val oversOnlyLeftForBOvers = if (ballsOnlyFromMaxOvers < ballsOnlyFromBOvers) {
            oversOnlyFromMaxOvers - 1 - oversOnlyFromBOvers
        } else {
            oversOnlyFromMaxOvers - oversOnlyFromBOvers
        }

        val teamBOversLeft = oversOnlyLeftForBOvers + ballsOnlyLeftForBOvers.round(1) / 10

        val resource = data.let {
            it?.data?.oversLeft?.get(getIndex(teamBOversLeft))?.get(teamBWickets.toInt())
        }

        Log.d(TAG, "calculate: The resource is: $resource")
        resource?.let {
            val revisedResource = 100 - it
            val parScore = teamARun.toInt() * revisedResource / 100
            _uiState.update { currentState ->
                currentState.copy(
                    targetRunForTeamB = ceil(parScore).toInt()
                )
            }
        }
    }

    private fun getIndex(overs: Double): Int {
        val fullOvers = overs.toInt()
        val balls = overs - fullOvers
        return fullOvers * 6 + (balls * 10).toInt()
    }

    private fun Double.round(decimals: Int): Double {
        var multiplier = 1.0
        repeat(decimals) { multiplier *= 10 }
        return kotlin.math.round(this * multiplier) / multiplier
    }
}
