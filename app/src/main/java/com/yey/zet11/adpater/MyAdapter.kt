package com.yey.zet11.adpater

import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(val binding: Item342Binding): RecyclerView.ViewHolder(binding.root)

class MyAdapter(val datas: MutableList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemCount(): Int{
        Log.d("kkang", "init datas size: ${datas.size}")
        return datas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
            = MyViewHolder(Item342Binding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("kkang","onBindViewHolder : $position")
        val binding=(holder as MyViewHolder).binding
        //뷰에 데이터 출력
        binding.itemData.text= datas[position]

        //뷰에 이벤트 추가
        binding.itemRoot.setOnClickListener{
            Log.d("kkang", "item root click : $position")
        }
    }
}