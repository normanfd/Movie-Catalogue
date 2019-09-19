package com.norman.madesubmission1norman.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.norman.madesubmission1norman.R;
import com.norman.madesubmission1norman.activity.DetailedMovieActivity;
import com.norman.madesubmission1norman.model.Movie;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.movieViewHolder> {

    private Context context;
    private ArrayList<Movie> listMovie;

    public MovieAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Movie> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<Movie> listMovie) {
        this.listMovie = listMovie;
    }

    @NonNull
    @Override
    public movieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_movie, parent, false);
        return new movieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull movieViewHolder holder, int position) {
        final Movie m = getListMovie().get(position);
        Glide.with(context)
                .load(m.getPoster())
                .apply(new RequestOptions().override(100, 100))
                .into(holder.imgPoster);
        holder.tvName.setText(m.getTitle());
        holder.tvReleaseDate.setText(m.getReleaseDate());
        holder.tvGenre.setText(m.getGenre());
        holder.movie = m;
    }

    @Override
    public int getItemCount() {
        return getListMovie().size();
    }

    class movieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.img_item_photo)
        ImageView imgPoster;
        @BindView(R.id.tv_item_name)
        TextView tvName;
        @BindView(R.id.tv_item_genre)
        TextView tvGenre;
        @BindView(R.id.tv_item_releasedate)
        TextView tvReleaseDate;
        Movie movie;

        movieViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailedMovieActivity.class);
            intent.putExtra("key", movie);
            context.startActivity(intent);
        }
    }
}
