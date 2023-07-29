package com.yey.zet11.adpater

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yey.zet11.ViewPager2_Recycle_Activity
import com.yey.zet11.databinding.Item354Binding

class MyPagerViewHolder(val binding: Item354Binding): RecyclerView.ViewHolder(binding.root)

class MyPagerAdapter(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int{
        return datas.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = MyPagerViewHolder(
        Item354Binding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding=(holder as MyPagerViewHolder).binding
        //뷰에 데이터 출력
        binding.itemPagerTextView.text=datas[position]
        when(position % 3){
            0 -> binding.itemPagerTextView.setBackgroundColor(Color.RED)
            1 -> binding.itemPagerTextView.setBackgroundColor(Color.BLUE)
            2 -> binding.itemPagerTextView.setBackgroundColor(Color.GREEN)
        }
    }
}