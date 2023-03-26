package com.sukajee.dlscore.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@Composable
fun MainPage(viewModel: DLSViewModel) {
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
                        text = "DLS Calculator",
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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .verticalScroll(state = scrollState)
                .background(Color.Green.copy(alpha = 0.2f))
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            if(uiState.targetRunForTeamB != -1) {
                Text(
                    text = uiState.targetRunForTeamB.toString(),
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontSize = 120.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Red
                )
            }
            DLSTextField(
                value = viewModel.teamARun,
                onValueChange = { text ->
                    viewModel.updateTeamARun(text)
                },
                label = "Team A Runs",
                maxChar = 3
            )
            Spacer(modifier = Modifier.height(2.dp))
            DLSTextField(
                value = viewModel.teamAWickets,
                onValueChange = { text ->
                    viewModel.updateTeamAWickets(text)
                },
                label = "Team A Wickets",
                maxChar = 2
            )
            Spacer(modifier = Modifier.height(16.dp))
            DLSTextField(
                value = viewModel.teamBOvers,
                onValueChange = { text ->
                    viewModel.updateTeamBOvers(text)
                },
                label = "Team B Overs",
                maxChar = 2
            )
            Spacer(modifier = Modifier.height(2.dp))
            DLSTextField(
                value = viewModel.teamBWickets,
                onValueChange = { text ->
                    viewModel.updateTeamBWickets(text)
                },
                label = "Team B Wickets",
                maxChar = 1
            )
            Spacer(modifier = Modifier.height(16.dp))
            DLSTextField(
                value = viewModel.maxOver,
                onValueChange = { text ->
                    viewModel.updateMaxOvers(text)
                },
                label = "Maximum Overs",
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
                        text = "Reset".uppercase(),
                        fontSize = 18.sp
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = { viewModel.calculate() },
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
                        text = "Calculate".uppercase(),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}
