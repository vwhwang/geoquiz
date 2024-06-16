package com.example.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class CheatViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {
    var clickedShowAnswer = false
}