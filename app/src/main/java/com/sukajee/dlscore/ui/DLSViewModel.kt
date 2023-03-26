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
import kotlinx.coroutines.launch
import javax.inject.Inject

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
    var maxOver by mutableStateOf("")
        private set

    init {
        viewModelScope.launch {
            data = repository.getData()
            Log.d("ViewModel", "data is $data")
        }
    }

    fun updateTeamARun(run: String) {
        teamARun = run
    }

    fun updateTeamAWickets(wickets: String) {
        teamAWickets = wickets
    }

    fun updateTeamBOvers(overs: String) {
        teamBOvers = overs
    }

    fun updateTeamBWickets(wickets: String) {
        teamBWickets = wickets
    }

    fun updateMaxOvers(overs: String) {
        maxOver = overs
    }

    fun reset() {

    }

    fun calculate() {
//        viewModelScope.launch {
//            val oversOnlyFromMaxOvers = maxOverState.toInt()
//            val ballsOnlyFromMaxOvers = maxOverState.toDouble() % 10
//            val oversOnlyFromBOvers = teamBOversState.toInt()
//            val ballsOnlyFromBOvers = teamBOversState.toDouble() % 10
//
//            val ballsOnlyLeftForBOvers = if (ballsOnlyFromMaxOvers < ballsOnlyFromBOvers) {
//                ballsOnlyFromMaxOvers + 6 - ballsOnlyFromBOvers
//            } else {
//                ballsOnlyFromMaxOvers - ballsOnlyFromBOvers
//            }
//            val oversOnlyLeftForBOvers = if (ballsOnlyFromMaxOvers < ballsOnlyFromBOvers) {
//                oversOnlyFromMaxOvers - 1 - oversOnlyFromBOvers
//            } else {
//                oversOnlyFromMaxOvers - oversOnlyFromBOvers
//            }
//
//            val teamBOversLeft = oversOnlyLeftForBOvers + ballsOnlyLeftForBOvers
//            val resource = data.let {
//                it?.data?.oversLeft?.get(getIndex(teamBOversLeft))?.get(teamBWicketsState.toInt())
//            }
//
//            resource?.let {
//                val revisedResource = 100 - it
//                val parScore = teamARunState.toInt() * revisedResource / 100
//
//            }
//        }
    }

    private fun getIndex(overs: Double): Int {
        val fullOvers = overs.toInt()
        val balls = overs - fullOvers
        return fullOvers * 6 + (balls * 10).toInt()
    }
}
