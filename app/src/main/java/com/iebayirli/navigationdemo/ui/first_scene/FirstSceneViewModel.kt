package com.iebayirli.navigationdemo.ui.first_scene

import com.iebayirli.navigationdemo.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstSceneViewModel @Inject constructor() : BaseViewModel() {

    fun goToSecondFragmentClicked() {
        navigate(FirstSceneFragmentDirections.actionFirstSceneFragmentToSecondSceneFragment())
    }

    fun goToSecondFragmentWithArgs() {
        navigate(
            FirstSceneFragmentDirections.actionFirstSceneFragmentToSecondSceneFragment(
                userId = "Test user id"
            )
        )
    }
}