package com.yey.zet11.adpater

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.yey.zet11.fragment.OneFragment
import com.yey.zet11.fragment.ThreeFragment
import com.yey.zet11.fragment.TwoFragment

class MyFragmentPagerAdapter(activity: FragmentActivity): FragmentStateAdapter(activity){
    val fragments: List<Fragment>
    init {
        fragments= listOf(OneFragment(), TwoFragment(), ThreeFragment())
        Log.d("kkang" ,"fragments size : ${fragments.size}")
    }
    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]
}