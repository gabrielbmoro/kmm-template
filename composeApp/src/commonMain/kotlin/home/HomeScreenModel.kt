package home

import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.core.model.ScreenModel

class HomeScreenModel : ScreenModel {
    val uiState = mutableStateOf(UiState())

    data class UiState(
        val showContent: Boolean = false
    )
}