package com.sukajee.dlscore.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun DLSTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    maxChar: Int,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = { text ->
            if(text.isDigit()) onValueChange(text.take(maxChar))
        },
        label = { Text(label) },
        modifier = modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.NumberPassword,
            imeAction = ImeAction.Next
        ),
        visualTransformation = VisualTransformation.None,
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            /*backgroundColor = Color.Green.copy(alpha = 0.1f),*/
            cursorColor = Color.Blue,
            focusedIndicatorColor = Color.Green.copy(0.9f),
            unfocusedIndicatorColor = Color.Green.copy(0.3f),
            focusedLabelColor = Color(0xFF0A8149)
        )
    )
}

fun String.isDigit(): Boolean {
    this.forEach {
        if(it.isDigit().not()) return false
    }
    return true
}
