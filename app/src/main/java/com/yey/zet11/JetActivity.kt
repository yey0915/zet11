package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.yey.zet11.databinding.ActivityJetBinding

class JetActivity : AppCompatActivity() {

    lateinit var binding: ActivityJetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJetBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    //메뉴 액션바(테마 사용)- 툴바로 대체할 예정
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // 화면 출력하기 위한 객체 생성 : 인스턴스화
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_total, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.menu1 -> {
            Toast.makeText(this@JetActivity, "1번 메뉴 클릭됨", Toast.LENGTH_LONG).show()
            Log.d("kkang", "menu1 click")
            true
        }
        R.id.menu2 -> {
            Toast.makeText(this@JetActivity, "2번 메뉴 클릭됨", Toast.LENGTH_LONG).show()
            Log.d("kkang", "menu2 click")
            true
        }
        R.id.menu3 -> {
            Toast.makeText(this@JetActivity, "3번 메뉴 클릭됨", Toast.LENGTH_LONG).show()
            Log.d("kkang", "menu3 click")
            true
        }
        R.id.menu22 -> {
            Toast.makeText(this@JetActivity, "Add 메뉴 클릭됨", Toast.LENGTH_LONG).show()
            Log.d("kkang", "menu4 click")
            true
        }
        R.id.menu33 -> {
            Toast.makeText(this@JetActivity, "Search 메뉴 클릭됨", Toast.LENGTH_LONG).show()
            Log.d("kkang", "menu5 click")
            true
        }
        else -> super.onOptionsItemSelected(item)
    }


}