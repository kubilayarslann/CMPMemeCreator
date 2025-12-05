package com.karslan.cmpmemecreator.core.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.karslan.cmpmemecreator.meme_editor.presentation.MemeEditorUIContent
import com.karslan.cmpmemecreator.meme_gallery.presentation.MemeGalleryScreen

@Composable
fun NavigationRoot() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Route.MemeGallery
    ) {
        composable<Route.MemeGallery> {
            MemeGalleryScreen(
                onMemeTempSelected = { memeTemplate ->
                    navController.navigate(Route.MemeEditor(memeId = memeTemplate.id))
                }
            )
        }

        composable<Route.MemeEditor> {
            MemeEditorUIContent()
        }
    }

}