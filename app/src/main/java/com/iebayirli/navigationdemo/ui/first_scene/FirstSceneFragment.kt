package com.iebayirli.navigationdemo.ui.first_scene

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.iebayirli.navigationdemo.R
import com.iebayirli.navigationdemo.base.BaseFragment
import com.iebayirli.navigationdemo.databinding.FragmentFirstSceneBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstSceneFragment : BaseFragment<FragmentFirstSceneBinding, FirstSceneViewModel>() {

    override val layoutId: Int = R.layout.fragment_first_scene

    override val viewModel: FirstSceneViewModel by viewModels()

    override fun onReady(savedInstanceState: Bundle?) {

    }

}