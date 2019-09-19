package com.norman.madesubmission1norman.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.norman.madesubmission1norman.R;
import com.norman.madesubmission1norman.model.Movie;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailedMovieActivity extends AppCompatActivity {

    @BindView(R.id.tv_movie_item_name)
    TextView textViewMovieName;
    @BindView(R.id.tv_movie_item_genre)
    TextView textViewMovieGenre;
    @BindView(R.id.tv_movie_item_rating)
    TextView textViewMovieRating;
    @BindView(R.id.tv_movie_item_releasedate)
    TextView textViewMovieDate;
    @BindView(R.id.tv_movie_item_desc)
    TextView textViewMovieDesc;
    @BindView(R.id.img_movie_item_photo)
    ImageView imgPoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_movie);

        ButterKnife.bind(this);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        Movie movieAccept = getIntent().getParcelableExtra("key");

        assert movieAccept != null;
        Glide.with(this)
                .load(movieAccept.getPoster())
                .apply(new RequestOptions().override(200, 200))
                .into(imgPoster);
        textViewMovieName.setText(movieAccept.getTitle());
        textViewMovieDate.setText(movieAccept.getReleaseDate());
        textViewMovieGenre.setText(movieAccept.getGenre());
        textViewMovieRating.setText(movieAccept.getRating());
        textViewMovieDesc.setText(movieAccept.getOverview());
    }
}
