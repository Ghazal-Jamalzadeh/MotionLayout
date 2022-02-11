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
    }
}