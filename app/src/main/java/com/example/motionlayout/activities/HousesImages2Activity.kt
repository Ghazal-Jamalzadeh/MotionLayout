package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.motionlayout.R
import com.example.motionlayout.databinding.ActivityHousesImages2Binding

class HousesImages2Activity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityHousesImages2Binding

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHousesImages2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //Image 1
        binding.img1.setOnClickListener {
            if (index == 0) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.img2__scene, R.id.img1_scene)
            binding.motionLayout.transitionToEnd()

            index = 0
        }
        //Image 2
        binding.img2.setOnClickListener {
            if (index == 1) return@setOnClickListener

            if (index == 2) {
                binding.motionLayout.setTransition(R.id.img3__scene, R.id.img2__scene)
            } else {
                binding.motionLayout.setTransition(R.id.img1_scene, R.id.img2__scene)
            }
            binding.motionLayout.transitionToEnd()

            index = 1
        }
        //Image 3
        binding.img3.setOnClickListener {
            if (index == 2) return@setOnClickListener

            binding.motionLayout.setTransition(R.id.img2__scene, R.id.img3__scene)
            binding.motionLayout.transitionToEnd()

            index = 2
        }
    }
}