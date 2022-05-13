package com.example.motionlayout.project.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.databinding.ActivityProjectHomeBinding
import com.example.motionlayout.project.home.cars.CarsAdapter
import com.example.motionlayout.project.home.cars.CarsModel
import com.example.motionlayout.project.home.images.ImagesAdapter
import com.example.motionlayout.project.home.images.ImagesModel

class ProjectHomeActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectHomeBinding

    //Other
    private val imagesAdapter by lazy { ImagesAdapter(loadImages()) }
    private val carsAdapter by lazy { CarsAdapter(loadCars()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Init views
        binding.apply {
            //Images recycler
            contentImagesList.apply {
                layoutManager = LinearLayoutManager(this@ProjectHomeActivity, LinearLayoutManager.HORIZONTAL, true)
                adapter = imagesAdapter
            }
            //cars recycler
            contentRentList.apply {
                layoutManager = LinearLayoutManager(this@ProjectHomeActivity, LinearLayoutManager.HORIZONTAL, true)
                adapter = carsAdapter
            }
        }
    }

    private fun loadImages(): MutableList<ImagesModel> = arrayListOf(
        ImagesModel(R.drawable.alps1),
        ImagesModel(R.drawable.alps2),
        ImagesModel(R.drawable.alps3)
    )

    private fun loadCars(): MutableList<CarsModel> = arrayListOf(
        CarsModel(R.drawable.offroad_car_1, 1200, "اسپارتک"),
        CarsModel(R.drawable.offroad_car_2, 840, "جیپ سفید"),
        CarsModel(R.drawable.offroad_car_3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.offroad_car_4, 980, "جیپ آبی")
    )
}