package com.example.flixsterapp;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.flixsterapp.Models.Movie;

public class ViewHolder1 extends RecyclerView.ViewHolder{
    TextView title;
    TextView overview;
    ImageView poster;
    Context context;

    public ViewHolder1(@NonNull View itemView, Context context) {
        super(itemView);
        title = itemView.findViewById(R.id.tv_title);
        overview = itemView.findViewById(R.id.tv_overview);
        poster = itemView.findViewById(R.id.img_Poster);
        this.context = context;
    }

    public void bind1(Movie movie){
        title.setText(movie.getTitle());
        overview.setText(movie.getDesc());
        String imageURL;
        if(context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            imageURL = movie.getBackDrop();
        }
        else{
            imageURL = movie.getPoster();
        }

        Glide.with(context).load(imageURL).into(poster);
    }


}