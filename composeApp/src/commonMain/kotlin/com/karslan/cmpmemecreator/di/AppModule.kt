package com.karslan.cmpmemecreator.di

import com.karslan.cmpmemecreator.meme_editor.presentation.MemeEditorViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {

    viewModelOf(::MemeEditorViewModel)

}