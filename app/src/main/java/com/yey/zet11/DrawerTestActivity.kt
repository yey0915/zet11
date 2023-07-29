package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.yey.zet11.databinding.ActivityDrawerTestBinding

class DrawerTestActivity : AppCompatActivity() {
    lateinit var toggle:ActionBarDrawerToggle
    lateinit var binding : ActivityDrawerTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrawerTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뷰 부분 중요
        //드로워 태그 하위에 뷰 2개가 있음
        //첫번째 뷰에 메인 화면 뷰
        //부번째 뷰가 서랍 뷰(사이드에서 나오는 메뉴)
        toggle = ActionBarDrawerToggle(this@DrawerTestActivity,
            binding.drawer, R.string.drawer_opened, R.string.drawer_closed)
        //액션바, 토글부분 연결, 버튼 클릭시 슬라이딩 화면이 보임
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //동기화
        toggle.syncState()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //이벤트가 toggle 버튼에서 제공된거라면..
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}