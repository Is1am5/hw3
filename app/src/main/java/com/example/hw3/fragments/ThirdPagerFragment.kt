package com.example.hw3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw3.R
import com.example.hw3.adapters.ListAdapters
import com.example.hw3.base.BaseFragment
import com.example.hw3.databinding.FragmentThirdPagerBinding
import java.util.*


class ThirdPagerFragment : BaseFragment<FragmentThirdPagerBinding, FragmentViewModel>() {

    private lateinit var viewModel: FragmentViewModel
    private lateinit var data: ArrayList<String>

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentThirdPagerBinding {
        return FragmentThirdPagerBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[FragmentViewModel::class.java]
    }

    override fun initView() {
        viewModel.operation.observe(viewLifecycleOwner) {
            val adapter = ListAdapters(it)
            binding.recyclerView2.adapter = adapter
        }

    }
}