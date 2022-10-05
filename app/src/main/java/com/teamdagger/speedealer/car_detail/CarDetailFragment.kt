package com.teamdagger.speedealer.car_detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.teamdagger.speedealer.R
import com.teamdagger.speedealer.base.BaseFragment
import com.teamdagger.speedealer.databinding.FragmentCarDetailBinding

class CarDetailFragment : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCarDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    private lateinit var binding: FragmentCarDetailBinding

}