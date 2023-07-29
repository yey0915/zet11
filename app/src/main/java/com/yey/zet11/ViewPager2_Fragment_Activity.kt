package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yey.zet11.adpater.MyFragmentPagerAdapter
import com.yey.zet11.databinding.ActivityViewPager2FragmentBinding

class ViewPager2_Fragment_Activity : AppCompatActivity() {

    lateinit var binding: ActivityViewPager2FragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewPager2FragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뷰페이저2 구현 - 프래그먼트 방식으로 연결
        //프레그먼트 구현 방식 1) xml, 2) 액티비티 코드상 출력
        //355

        //임시데이터
        val datas = mutableListOf<String>()
        for(i in 1..3){
            datas.add("Item $i")
        }
        val adapter= MyFragmentPagerAdapter(this)
        binding.viewpager.adapter = adapter
    }
}