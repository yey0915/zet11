package com.yey.zet11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.yey.zet11.databinding.ActivityFragTestBinding
import com.yey.zet11.fragment.OneFragment
import com.yey.zet11.fragment.TwoFragment

class FragTestActivity : AppCompatActivity() {

    lateinit var binding: ActivityFragTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager: FragmentManager = supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        val fragment = TwoFragment()
        transaction.add(R.id.fragment_content, fragment)

        transaction.addToBackStack(null)
        transaction.commit()
    }
}