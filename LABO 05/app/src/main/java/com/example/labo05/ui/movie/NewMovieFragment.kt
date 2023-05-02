package com.example.labo05.ui.movie

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.labo05.R
import com.example.labo05.data.model.MovieModel
import com.google.android.material.textfield.TextInputEditText

class NewMovieFragment : Fragment() {

    private val viewModel: MovieViewModel by activityViewModels {
        MovieViewModel.Factory
    }
    private lateinit var name: TextInputEditText
    private lateinit var category: TextInputEditText
    private lateinit var description: TextInputEditText
    private lateinit var calification: TextInputEditText
    private lateinit var actionSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_create_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind(view)
        actionSubmit.setOnClickListener {
            createMovie()
        }

    }

    private fun bind(view: View){
        name = view.findViewById(R.id.name_create)
        category = view.findViewById(R.id.Categoria_create)
        description = view.findViewById(R.id.description_create)
        calification = view.findViewById(R.id.calification_create)
        actionSubmit = view.findViewById(R.id.submit)
    }

    private fun createMovie() {
        val newMovie = MovieModel(
            name.text.toString(),
            category.text.toString(),
            description.text.toString(),
            calification.text.toString(),
        )
        viewModel.addMovies(newMovie)

        Log.d("APP TAG", viewModel.getMovies().toString())

        findNavController().popBackStack()
    }

}