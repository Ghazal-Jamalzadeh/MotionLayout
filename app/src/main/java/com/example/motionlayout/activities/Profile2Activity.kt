package com.example.motionlayout.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.MoviesAdapter
import com.example.motionlayout.adapters.MoviesAdapter2
import com.example.motionlayout.adapters.MoviesAdapter3
import com.example.motionlayout.databinding.ActivityProfile2Binding
import com.example.motionlayout.models.MoviesModel

class Profile2Activity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityProfile2Binding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { MoviesAdapter2(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfile2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recycler
        addMovies()
        binding.apply {
            profileList.apply {
                layoutManager = LinearLayoutManager(this@Profile2Activity)
                adapter = moviesAdapter
            }
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "The Shawshank Redemption", R.drawable.top_the_shawshank_redemption))
        moviesList.add(MoviesModel(2, "The Godfather", R.drawable.top_the_godfather))
        moviesList.add(MoviesModel(3, "The Godfather: Part II", R.drawable.top_the_godfather__part_ii))
        moviesList.add(MoviesModel(4, "The Dark Knight", R.drawable.top_the_dark_knight))
        moviesList.add(MoviesModel(5, "12 Angry Men", R.drawable.top_12_angry_men))
        moviesList.add(MoviesModel(6, "Schindler’s List", R.drawable.top_schindlers_list))
        moviesList.add(MoviesModel(7, "Pulp Fiction", R.drawable.top_pulp_fiction))
        moviesList.add(MoviesModel(8, "Avengers: Infinity War", R.drawable.top_avengers__infinity_war))
        moviesList.add(MoviesModel(9, "Il buono, il brutto, il cattivo", R.drawable.top_il_buono_il_cattivo))
        moviesList.add(MoviesModel(10, "Fight Club", R.drawable.top_fight_club))
    }
}