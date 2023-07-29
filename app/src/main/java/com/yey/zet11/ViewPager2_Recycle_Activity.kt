package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yey.zet11.adpater.MyPagerAdapter
import com.yey.zet11.databinding.ActivityViewPager2RecycleBinding

class ViewPager2_Recycle_Activity : AppCompatActivity() {
    lateinit var binding : ActivityViewPager2RecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2RecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val datas = mutableListOf<String>()
        for (i in 1..3) {
            datas.add("Item $i")
        }

        //액티비티에 뷰페이져 태그부분 가지고 옴
        binding.viewpager.adapter = MyPagerAdapter(datas)
    }
}