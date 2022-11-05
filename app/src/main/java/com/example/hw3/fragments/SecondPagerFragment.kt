package com.example.hw3.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.hw3.R
import com.example.hw3.base.BaseFragment
import com.example.hw3.databinding.FragmentSecondPagerBinding


class SecondPagerFragment : BaseFragment<FragmentSecondPagerBinding, FragmentViewModel>() {

    private lateinit var viewModel: FragmentViewModel

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentSecondPagerBinding {
        return FragmentSecondPagerBinding.inflate(layoutInflater)
    }



    override fun initViewModel() {
        viewModel = ViewModelProvider(requireActivity())[FragmentViewModel::class.java]
    }

    override fun initView() {
        viewModel.counter.observe(viewLifecycleOwner) {
            binding.tvCounter.text = it.toString()
        }


    }
}