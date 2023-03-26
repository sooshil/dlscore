package com.sukajee.dlscore.ui

sealed class DlsUiEvents {
    data class Loading(
        val isLoading: Boolean
    ): DlsUiEvents()

    data class DisplayParScore(val parScore: Int) : DlsUiEvents()
}
