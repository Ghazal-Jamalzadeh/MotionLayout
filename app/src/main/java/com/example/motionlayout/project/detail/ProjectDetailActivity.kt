package com.example.motionlayout.project.detail

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.databinding.ActivityProjectDetailBinding
import com.example.motionlayout.project.home.cars.CarsModel
import com.example.motionlayout.project.other.CAR_IMG
import com.example.motionlayout.project.other.CAR_NAME
import com.example.motionlayout.project.other.CAR_PRICE

class ProjectDetailActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProjectDetailBinding

    //Other
    private val carsAdapter by lazy { DetailCarsAdapter(carsData()) }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Binding
        binding.apply {
            //Get data
            intent.extras?.let {
                detailCarImg.setImageResource(it.getInt(CAR_IMG))
                detailCarName.text = it.getString(CAR_NAME)
                detailRentPrice.text = "$${it.getInt(CAR_PRICE)}"
            }
            //Cars
            detailList.apply {
                layoutManager = LinearLayoutManager(this@ProjectDetailActivity)
                adapter = carsAdapter
            }
        }
    }

    private fun carsData(): MutableList<CarsModel> = arrayListOf(
        CarsModel(R.drawable.car1, 1200, "اسپارتک"),
        CarsModel(R.drawable.car2, 840, "جیپ سفید"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car3, 650, "جیپ بنفش"),
        CarsModel(R.drawable.car4, 980, "جیپ آبی")
    )
}