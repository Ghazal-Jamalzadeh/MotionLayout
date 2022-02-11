package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.HouseAdapter
import com.example.motionlayout.databinding.ActivityHousesBinding
import com.example.motionlayout.models.HouseModel

class HousesActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityHousesBinding

    //Other
    private var houseAdapter: HouseAdapter = HouseAdapter(housesData())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHousesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Binding
        binding.apply {
            housePageRecycler.apply {
                layoutManager = LinearLayoutManager(this@HousesActivity)
                adapter = houseAdapter
            }
        }
    }

    private fun housesData(): MutableList<HouseModel> = arrayListOf(
        HouseModel(
            "عنوان مطلب 1",
            "محل نمایش توضیحات مطلب 1",
            R.drawable.house1
        ),
        HouseModel(
            "عنوان مطلب 2",
            "محل نمایش توضیحات مطلب 2",
            R.drawable.house2
        ),
        HouseModel(
            "عنوان مطلب 3",
            "محل نمایش توضیحات مطلب 3",
            R.drawable.house5
        ),
        HouseModel(
            "عنوان مطلب 4",
            "محل نمایش توضیحات مطلب 4",
            R.drawable.house4
        ),
        HouseModel(
            "عنوان مطلب 5",
            "محل نمایش توضیحات مطلب 5",
            R.drawable.house3
        )
    )
}