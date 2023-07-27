package com.yey.zet11.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yey.zet11.R
import com.yey.zet11.databinding.FragmentOneBinding

class OneFragment : Fragment() {

    lateinit var  binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_one, container, false)
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return  binding.root
    }


}