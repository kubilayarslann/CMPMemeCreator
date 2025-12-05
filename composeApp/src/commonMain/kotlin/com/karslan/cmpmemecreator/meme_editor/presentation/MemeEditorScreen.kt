package com.karslan.cmpmemecreator.meme_editor.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.karslan.cmpmemecreator.core.theme.MemeCreatorTheme
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
fun MemeEditorUIContent(
    viewModel: MemeEditorViewModel = viewModel()
) {

    val state by viewModel.state.collectAsStateWithLifecycle()

    MemeEditorScreen(
        state = state,
        onAction = viewModel::onAction
    )

}


@Composable
fun MemeEditorScreen(
    state: MemeEditorState,
    onAction: (MemeEditorActions) -> Unit
) {


}

@Preview
@Composable
private fun MemeEditorScreenPreview() {
    MemeCreatorTheme {
        MemeEditorScreen(
            state = MemeEditorState(),
            onAction = {}
        )
    }
}
