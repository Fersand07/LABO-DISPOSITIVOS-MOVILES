package com.example.labo05

import android.graphics.Movie
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FirstFragment : Fragment() {
    private lateinit var actionToMovie: FloatingActionButton
    private lateinit var informationMovie: ConstraintLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        actionToMovie = view.findViewById(R.id.action_to_movie)
        informationMovie = view.findViewById(R.id.harry_movie)

        actionToMovie.setOnClickListener {
            it.findNavController().navigate(R.id.action_firstFragment_to_create_fragment2)
        }

        informationMovie.setOnClickListener{
            it.findNavController().navigate(R.id.action_firstFragment_to_description_fragment)
        }


    }

}