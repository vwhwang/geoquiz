package com.example.geoquiz

import androidx.lifecycle.SavedStateHandle
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class QuizViewModelTest {
    @Test
    fun providesExpectedQuestionText() {
        val savedStateHandle = SavedStateHandle()
        val quizViewModel = QuizViewModel(savedStateHandle)

        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
        assertTrue(quizViewModel.currentQuestionAnswer)
    }

    @Test
    fun wrapsAroundQuestionBank() {
        val savedStateHandle = SavedStateHandle(mapOf(CURRENT_INDEX_KEY to 2))
        val quizViewModel = QuizViewModel(savedStateHandle)
        assertEquals(R.string.question_africa, quizViewModel.currentQuestionText)
        quizViewModel.moveToNext()
        assertEquals(R.string.question_australia, quizViewModel.currentQuestionText)
    }
}