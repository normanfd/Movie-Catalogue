package com.norman.madesubmission1norman.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.norman.madesubmission1norman.R;
import com.norman.madesubmission1norman.adapter.MovieAdapter;
import com.norman.madesubmission1norman.data.MovieData;
import com.norman.madesubmission1norman.model.Movie;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rvMovie)
    RecyclerView rvMovie;
    private ArrayList<Movie> listMovie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        rvMovie.setHasFixedSize(true);
        MovieAdapter listMovieAdapter = new MovieAdapter(this);

        listMovie.addAll(MovieData.getListData());

        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        listMovieAdapter.setListMovie(listMovie);
        rvMovie.setAdapter(listMovieAdapter);



    }
}
