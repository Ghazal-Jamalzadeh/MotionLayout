package com.example.motionlayout.activities



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.motionlayout.R
import com.example.motionlayout.adapters.SearchMoviesAdapter
import com.example.motionlayout.databinding.ActivitySearchBoxBinding
import com.example.motionlayout.models.MoviesModel

class SearchBoxActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivitySearchBoxBinding

    //Other
    private val moviesList: MutableList<MoviesModel> = mutableListOf()
    private val moviesAdapter by lazy { SearchMoviesAdapter(moviesList) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Recycler
        addMovies()
        binding.apply {
            moviesRecycler.apply {
                layoutManager = LinearLayoutManager(this@SearchBoxActivity)
                adapter = moviesAdapter
            }
        }
        //Close
        binding.searchBoxTxtInpLay.setStartIconOnClickListener {
            binding.searchBoxEdt.setText("")
            binding.searchBoxImg.performClick()
        }
    }

    private fun addMovies() {
        moviesList.add(MoviesModel(1, "The Shawshank Redemption", R.drawable.top_the_shawshank_redemption))
        moviesList.add(MoviesModel(2, "The Godfather", R.drawable.top_the_godfather))
        moviesList.add(MoviesModel(3, "The Godfather: Part II", R.drawable.top_the_godfather__part_ii))
        moviesList.add(MoviesModel(4, "The Dark Knight", R.drawable.top_the_dark_knight))
        moviesList.add(MoviesModel(5, "12 Angry Men", R.drawable.top_12_angry_men))
        moviesList.add(MoviesModel(6, "Schindler’s List", R.drawable.top_schindlers_list))
        moviesList.add(
            MoviesModel(
                7, "The Lord of the Rings: The Return of the King",
                R.drawable.top_the_lord_of_the_rings__the_return_of_the_king
            )
        )
        moviesList.add(MoviesModel(8, "Pulp Fiction", R.drawable.top_pulp_fiction))
        moviesList.add(MoviesModel(9, "Avengers: Infinity War", R.drawable.top_avengers__infinity_war))
        moviesList.add(MoviesModel(10, "Il buono, il brutto, il cattivo", R.drawable.top_il_buono_il_cattivo))
        moviesList.add(MoviesModel(11, "Fight Club", R.drawable.top_fight_club))
        moviesList.add(
            MoviesModel(
                12, "The Lord of the Rings: The Fellowship of the Ring",
                R.drawable.top_the_lord_of_the_rings__the_fellowship_of_the_ring
            )
        )
        moviesList.add(MoviesModel(13, "Forrest Gump", R.drawable.top_forrest_gump))
        moviesList.add(MoviesModel(14, "The Empire Strikes Back", R.drawable.top_the_empire_strikes_back))
        moviesList.add(MoviesModel(15, "Inception", R.drawable.top_inception))
    }
}