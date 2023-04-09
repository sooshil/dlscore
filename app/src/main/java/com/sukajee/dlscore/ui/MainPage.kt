package com.sukajee.dlscore.ui

import android.widget.ProgressBar
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sukajee.dlscore.R

@Composable
fun MainPage(viewModel: DlsViewModel) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color.Red.copy(alpha = 0.9f),
                elevation = 0.dp
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.dls_calculator),
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }
        }
    ) {
        val scrollState = rememberScrollState()
        val uiState by viewModel.uiState.collectAsState()
        val targetForB by animateIntAsState(
            targetValue = uiState.targetRunForTeamB,
            animationSpec = tween(
                durationMillis = 800,
                easing = LinearEasing,
                delayMillis = 300
            )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .verticalScroll(state = scrollState)
                .background(Color.Green.copy(alpha = 0.05f))
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            ScoreDisplay(
                targetScoreForB = targetForB,
                visible = uiState.targetRunForTeamB > -0
                /**
                 *  -0 seems to be greater than 0. The target could be zero as well. Also, it
                 *  doesn't look good starting the animation other number than zero. So initialized
                 *  with 0 and compared here with -0
                 */
            )
            ErrorDisplay(
                visible = uiState.shouldDisplayMissingValueError
            )
            DLSTextField(
                value = viewModel.teamARun,
                onValueChange = { text ->
                    viewModel.updateTeamARun(text)
                },
                label = stringResource(R.string.team_A_runs),
                maxChar = 3
            )
            Spacer(modifier = Modifier.height(2.dp))
            DLSTextField(
                value = viewModel.teamAWickets,
                onValueChange = { text ->
                    viewModel.updateTeamAWickets(text)
                },
                label = stringResource(R.string.team_A_wickets),
                maxChar = 2
            )
            Spacer(modifier = Modifier.height(16.dp))
            DLSTextField(
                value = viewModel.teamBOvers,
                onValueChange = { text ->
                    viewModel.updateTeamBOvers(text)
                },
                decimalAllowed = true,
                label = stringResource(R.string.team_B_overs),
                maxChar = 2
            )
            Spacer(modifier = Modifier.height(2.dp))
            DLSTextField(
                value = viewModel.teamBWickets,
                onValueChange = { text ->
                    viewModel.updateTeamBWickets(text)
                },
                label = stringResource(R.string.team_B_wickets),
                maxChar = 1
            )
            Spacer(modifier = Modifier.height(16.dp))
            DLSTextField(
                value = viewModel.maxOvers,
                onValueChange = { text ->
                    viewModel.updateMaxOvers(text)
                },
                decimalAllowed = true,
                label = stringResource(R.string.maximum_overs),
                maxChar = 2
            )
            Spacer(modifier = Modifier.height(36.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedButton(
                    onClick = { viewModel.reset() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.5f)
                        .height(48.dp)
                        .clip(RoundedCornerShape(corner = CornerSize(24.dp))),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Red.copy(alpha = 0.9f),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        text = stringResource(R.string.reset).uppercase(),
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                    contentAlignment = Alignment.Center
                ) {
                    Button(
                        onClick = { viewModel.calculate() },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(24.dp))),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = Color.Red.copy(alpha = 0.9f),
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = if(uiState.isLoading.not()) stringResource(R.string.calculate).uppercase() else "",
                            fontSize = 18.sp
                        )
                    }
                    if(uiState.isLoading) {
                        CircularProgressIndicator(
                            color = Color(0xFF2B696F),
                            strokeWidth = 4.dp,
                            modifier = Modifier.size(36.dp)
                        )
                    }
                }
            }
        }
    }
}
