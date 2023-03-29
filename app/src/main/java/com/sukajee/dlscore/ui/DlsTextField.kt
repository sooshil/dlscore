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
    modifier: Modifier = Modifier,
    decimalAllowed: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = { text ->
            if (decimalAllowed.not()) {
                if (text.isDigit()) onValueChange(text.take(maxChar))
            } else {
                if (text.isDigitOrDecimal()) onValueChange(text.take(maxChar + 2))
            }
        },
        label = { Text(label) },
        modifier = modifier.fillMaxWidth(),
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = if (decimalAllowed) KeyboardType.Decimal else KeyboardType.NumberPassword,
            imeAction = ImeAction.Next
        ),
        visualTransformation = VisualTransformation.None,
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = Color.Green.copy(alpha = 0.05f),
            cursorColor = Color.Blue,
            focusedIndicatorColor = Color.Green.copy(0.9f),
            unfocusedIndicatorColor = Color.Green.copy(0.3f),
            focusedLabelColor = Color(0xFF0A8149)
        )
    )
}

fun String.isDigit(): Boolean {
    this.forEach {
        if (it.isDigit().not()) return false
    }
    return true
}

val allowedCharacterList = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.')
fun String.isDigitOrDecimal(): Boolean {
    this.forEach {
        if (allowedCharacterList.contains(it).not()) return false
    }
    return true
}
