package com.yey.zet11.adpater

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yey.zet11.databinding.Item2342Binding

//Recycle2Activity -> 연결할 어댑터
//뷰홀터 클래스도 같이 정의
class MyViewHolder2(val binding: Item2342Binding): RecyclerView.ViewHolder(binding.root)
class MyAdapter2(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun getItemCount(): Int{
        Log.d("kkang", "init datas size: ${datas.size}")
        return datas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = MyViewHolder2(Item2342Binding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("kkang","onBindViewHolder : $position")
        val binding=(holder as MyViewHolder2).binding
        //뷰에 데이터 출력
        binding.itemData.text= datas[position]

        //뷰에 이벤트 추가
        binding.itemRoot.setOnClickListener{
            Log.d("kkang", "item root click : $position")
        }
    }
}