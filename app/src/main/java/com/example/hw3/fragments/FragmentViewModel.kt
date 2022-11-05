package com.example.hw3.fragments

import androidx.lifecycle.MutableLiveData
import com.example.hw3.base.BaseViewModel
import java.util.*


class FragmentViewModel : BaseViewModel() {

    private var mCounter = 0
    private var mOperations = arrayListOf<String>()

    val counter = MutableLiveData<Int>()
    val operation = MutableLiveData<ArrayList<String>>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        mOperations.add("+")
        operation.value = mOperations
    }

    fun onDecrementClick() {
        mCounter--
        counter.value = mCounter
        mOperations.add("-")
        operation.value = mOperations
    }
}