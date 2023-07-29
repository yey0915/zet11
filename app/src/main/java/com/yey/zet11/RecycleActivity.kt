package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.yey.zet11.adpater.MyAdapter
import com.yey.zet11.databinding.ActivityRecycleBinding

//리사이클러 뷰를 출력을 해주는 빈 도화지
class RecycleActivity : AppCompatActivity() {
    lateinit var binding : ActivityRecycleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뷰홀더 생성 - 어댑터 생성 - 설정한 리사이클러 뷰를 메인에 적용
        //임시 데이터(리스트) : 공공 데이터가 이부분에 적용됨
        val datas = mutableListOf<String>()
        for(i in 1..9){
            datas.add("Item $i")
        }
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(datas)
        binding.recyclerView.addItemDecoration(
            DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL)
        )
    }
}