package com.example.hw3.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw3.fragments.FirstPagerFragment
import com.example.hw3.fragments.SecondPagerFragment
import com.example.hw3.fragments.ThirdPagerFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstPagerFragment()
            1 -> SecondPagerFragment()
            else -> ThirdPagerFragment()
        }
    }
}