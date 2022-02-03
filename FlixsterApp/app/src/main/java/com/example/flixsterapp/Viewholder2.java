package com.example.flixsterapp;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.flixsterapp.Models.Movie;

public class Viewholder2 extends RecyclerView.ViewHolder{
    ImageView backDrop;
    Context context;

    public Viewholder2(@NonNull View itemView, Context context) {
        super(itemView);
        backDrop = itemView.findViewById(R.id.movieBackDrop);
        this.context = context;
    }

    public void bind2(Movie movie){
        Glide.with(context).load(movie.getBackDrop()).into(backDrop);
    }

}
