package com.example.laboratorio05.ui.movie.billboard.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel
import com.example.laboratorio05.databinding.MovieItemBinding
import com.example.laboratorio05.generated.callback.OnClickListener

class MovieRecyclerViewHolder(private val binding: MovieItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener: (MovieModel) -> Unit) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieItemCardView.setOnClickListener{
            clickListener(movie)
        }
    }


}