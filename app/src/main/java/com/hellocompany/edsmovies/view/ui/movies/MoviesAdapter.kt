package com.hellocompany.edsmovies.view.ui.movies

import android.graphics.drawable.AnimationDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.getColor
import androidx.recyclerview.widget.RecyclerView
import com.hellocompany.edsmovies.R
import com.hellocompany.edsmovies.service.model.Movie
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_item.view.*
import java.lang.Exception

class MoviesAdapter(private val moviesResult: ArrayList<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_item, parent, false))

    override fun getItemCount(): Int {
        return moviesResult.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        (holder.movieLoading.drawable as AnimationDrawable).start()
        holder.movieTitle.text = moviesResult[position].title
        Picasso.get().load("https://image.tmdb.org/t/p/w500/" + moviesResult[position].poster_path)
            .into(holder.movieThumbnail, object : Callback{
                override fun onSuccess() {
                    holder.movieLoading.visibility = View.GONE
                }

                override fun onError(e: Exception?) {
                    Toast.makeText(holder.itemView.context, "Error loading image", Toast.LENGTH_SHORT).show()
                }
            })
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var movieTitle = view.movie_title!!
        var movieLoading = view.movie_loading!!
        var movieThumbnail = view.movie_thumbnail!!
    }

}