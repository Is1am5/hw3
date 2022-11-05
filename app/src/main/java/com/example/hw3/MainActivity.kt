package com.example.hw3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3.adapters.PagerAdapter
import com.example.hw3.base.BaseActivity
import com.example.hw3.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun inflateViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initViews() {
        binding.viewPager.adapter = PagerAdapter(this)
    }
}