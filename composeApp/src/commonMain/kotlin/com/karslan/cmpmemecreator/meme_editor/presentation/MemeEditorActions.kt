package com.karslan.cmpmemecreator.meme_editor.presentation

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.unit.IntSize
import com.karslan.cmpmemecreator.core.presentation.MemeTemplate

sealed interface MemeEditorActions {
    data object OnGoBackClick : MemeEditorActions
    data object OnConfirmLeaveWithoutSaving : MemeEditorActions
    data object OnDismissLeaveWithoutSaving : MemeEditorActions

    data class OnSaveMemeClick(val memeTemplate: MemeTemplate) : MemeEditorActions
    data object OnTapOutsideSelectedText : MemeEditorActions

    data object OnAddTextClick : MemeEditorActions
    data class OnSelectMemeText(val id: String) : MemeEditorActions
    data class OnEditMemeText(val id: String) : MemeEditorActions
    data class OnMemeTextChange(val id: String, val text: String) : MemeEditorActions
    data class OnDeleteMemeTextClick(val id: String) : MemeEditorActions

    data class OnMemeTextTransformChange(
        val id: String,
        val offset: Offset,
        val rotation: Float,
        val scale: Float
    ) : MemeEditorActions

    data class OnContainerSizeChange(val size: IntSize) : MemeEditorActions
}