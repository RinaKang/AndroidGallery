package com.example.mygallery

import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import java.util.*

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm,  BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val items = ArrayList<Fragment>()

    // 프래그먼트의 갯수
    override fun getCount(): Int {
        return items.size
    }

    // position위치의 프래그먼트
    override fun getItem(position: Int): Fragment {
        return items[position]
    }

    fun updateFragments(items: List<Fragment>){
        this.items.addAll(items)
    }
}
