package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.MoviesAdapter
import com.example.motionlayout.adapters.TitlesAdapter
import com.example.motionlayout.databinding.ActivityMoviesBinding
import com.example.motionlayout.databinding.ActivityTitlesBinding
import com.example.motionlayout.models.Movie
import com.example.motionlayout.models.Title

class TitlesActivity : AppCompatActivity() {
    //binding
    private lateinit var binding : ActivityTitlesBinding
    //list
    private  val titlesList : MutableList<Title> = mutableListOf()
    //adapter
    private lateinit var titlesAdapter : TitlesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titles)

        //view binding
        binding = ActivityTitlesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recycler
        addTitles()
        titlesAdapter = TitlesAdapter(titlesList)
        binding.apply {
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@TitlesActivity)
                adapter = titlesAdapter
            }
        }
    }

    private  fun addTitles (){
        titlesList.add(Title(7 , "season one"))
        titlesList.add(Title(9 , "Movie page"))
        titlesList.add(Title(10 , "Login page"))
        titlesList.add(Title(11 , "Houses page"))
        titlesList.add(Title(12 , "Big Image"))
        titlesList.add(Title(13 , "Splash Screen"))
        titlesList.add(Title(14 , "Search Box"))
        titlesList.add(Title(15 , "Profile"))
        titlesList.add(Title(16 , "Lock screen"))
        titlesList.add(Title(17 , "Housese Card Images"))
        titlesList.add(Title(18 , "Instagram Story"))
        titlesList.add(Title(19 , "Fab Menu"))
        titlesList.add(Title(20 , "Check List"))
        titlesList.add(Title(21 , "Telegram"))
    }
}