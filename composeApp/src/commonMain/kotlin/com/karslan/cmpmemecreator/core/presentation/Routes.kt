package com.karslan.cmpmemecreator.core.presentation

import kotlinx.serialization.Serializable

sealed interface Route{

    @Serializable
    data object MemeGallery : Route

    @Serializable
    data class MemeEditor(val memeId: String) : Route

}