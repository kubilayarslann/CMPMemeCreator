package com.karslan.cmpmemecreator

import androidx.compose.runtime.Composable
import com.karslan.cmpmemecreator.core.presentation.NavigationRoot
import com.karslan.cmpmemecreator.core.theme.MemeCreatorTheme
import com.karslan.cmpmemecreator.meme_gallery.presentation.MemeGalleryScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MemeCreatorTheme {
        NavigationRoot()
    }
}