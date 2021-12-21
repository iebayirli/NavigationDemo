package com.iebayirli.navigationdemo.ui.second_scene

import com.iebayirli.navigationdemo.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondSceneViewModel @Inject constructor() : BaseViewModel() {

    fun goBackClicked() {
        navigateBack()
    }
}