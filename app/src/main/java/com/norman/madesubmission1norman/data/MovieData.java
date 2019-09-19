package com.norman.madesubmission1norman.data;

import com.norman.madesubmission1norman.R;
import com.norman.madesubmission1norman.model.Movie;

import java.util.ArrayList;

public class MovieData {
    private static int[] imagedata = new int[]{
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_bumblebee,
            R.drawable.poster_creed,
            R.drawable.poster_dragonball,
            R.drawable.poster_hunterkiller,
            R.drawable.poster_spiderman,
            R.drawable.poster_venom,
            R.drawable.poster_thegirl,
            R.drawable.poster_deadpool
    };
    private static String[][] textdata = new String[][]{
            {"Aquaman", "December 7, 2018", "Action, Superhero, Adventure", "68%",
                    "Once home to the most advanced civilization on Earth, Atlantis is now an " +
                            "underwater kingdom ruled by the power-hungry King Orm. With a vast " +
                            "army at his disposal, Orm plans to conquer the remaining oceanic " +
                            "people and then the surface world. Standing in his way is Arthur Curry, " +
                            "Orm's half-human, half-Atlantean brother and true heir to the throne."
            },
            {"Avengers: Infinity War", "April 25, 2018", "Action, Adventure, Fantasy", "85%",
                    "As the Avengers and their allies have continued to protect the world from threats " +
                            "too large for any one hero to handle, a new danger has emerged from the " +
                            "cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is " +
                            "to collect all six Infinity Stones, artifacts of unimaginable power, " +
                            "and use them to inflict his twisted will on all of reality. Everything" +
                            " the Avengers have fought for has led up to this moment - the fate of " +
                            "Earth and existence itself has never been more uncertain."
            },
            {"Bumblebee", "December 15, 2018", "Action, Adventure, Science Fiction", "65%",
                    "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small " +
                            "Californian beach town. Charlie, on the cusp of turning 18 and trying to find " +
                            "her place in the world, discovers Bumblebee, battle-scarred and broken. When " +
                            "Charlie revives him, she quickly learns this is no ordinary yellow VW bug."},

            {"Creed II", "November 21, 2018", "Action, Drama, Sport", "67%",
                    "Between personal obligations and training for his next big fight against " +
                            "an opponent with ties to his family's past, Adonis Creed is up against " +
                            "the challenge of his life."},

            {"Dragon Ball Super: Broly", "December 14, 2018", "Action, Animation, Martial Arts", "74%",
                    "Earth is peaceful following the Tournament of Power. Realizing that the " +
                            "universes still hold many more strong people yet to see, Goku spends " +
                            "all his days training to reach even greater heights. Then one day, " +
                            "Goku and Vegeta are faced by a Saiyan called 'Broly' who they've never seen before."},

            {"Hunter Killer", "October 19, 2018", "Action, Thriller, Drama", "63%",
                    "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place " +
                            "in Russia, so he and his crew join an elite group working on the ground " +
                            "to prevent a war."},

            {"Spider-man: Into the Spider-Verse", "December 6, 2018", "Action, Animation, Comedy", "84%",
                    "Miles Morales is juggling his life between being a high school student and being " +
                            "a spider-man. When Wilson Kingpin Fisk uses a super collider, others " +
                            "from across the Spider-Verse are transported to this dimension."},

            {"Venom", "September 28, 2018", "Action, Horror, Science Fiction", "66%",
                    "Investigative journalist Eddie Brock attempts a comeback following a scandal, " +
                            "but accidentally becomes the host of Venom, a violent, super powerful " +
                            "alien symbiote. Soon, he must rely on his newfound powers to protect " +
                            "the world from a shadowy organization looking for a symbiote of their own."},

            {"The girl in The Spider Web", "October 25, 2018", "Action, Crime, Drama, Thriller", "60%",
                    "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, " +
                            "a computer engineer, to retrieve a program that he believes it is " +
                            "too dangerous to exist."},

            {"Deadpool 2", "May 10, 2018", "Action, Comedy, Adventure, Superhero", "75%",
                    "Wisecracking mercenary Deadpool battles the evil and powerful Cable and other " +
                            "bad guys to save a boy's life."}
    };

    public static ArrayList<Movie> getListData() {
        Movie movieData;
        ArrayList<Movie> list = new ArrayList<>();
        for (int i = 0; i < textdata.length; i++) {
            movieData = new Movie();
            movieData.setPoster(imagedata[i]);
            movieData.setTitle(textdata[i][0]);
            movieData.setReleaseDate(textdata[i][1]);
            movieData.setGenre(textdata[i][2]);
            movieData.setRating(textdata[i][3]);
            movieData.setOverview(textdata[i][4]);
            list.add(movieData);
        }
        return list;
    }

}
