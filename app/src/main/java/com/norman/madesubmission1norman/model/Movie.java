package com.norman.madesubmission1norman.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int poster;
    private String title, releaseDate, genre, rating, overview;

    public Movie() {
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    private Movie(Parcel in) {
        poster = in.readInt();
        title = in.readString();
        releaseDate = in.readString();
        genre = in.readString();
        rating = in.readString();
        overview = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(poster);
        parcel.writeString(title);
        parcel.writeString(releaseDate);
        parcel.writeString(genre);
        parcel.writeString(rating);
        parcel.writeString(overview);
    }
}
