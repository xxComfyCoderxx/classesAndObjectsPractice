package com.deonlewis.handson1;

public class Movie {

    private String title;
    private String studio;
    private String rating;

    // Question a
    public Movie(String t, String s, String r) {
        this.title = t;
        this.studio = s;
        this.rating = r;
    }
    // Question b
    public Movie(String t, String s) {
        this.title = t;
        this.studio = s;
        this.rating = "PG";
    }
    // Question c
    public static Movie[] getPG(Movie[] m) {
        Movie[] pgMovie = new Movie[m.length];
        int newArrInd = 0;
        for (int i = 0; i < m.length ; i++) {
            if (m[i].rating.equals("PG")) {
                pgMovie[newArrInd] = m[i];
                newArrInd++;
            }
        }
        return pgMovie;
    }
    // Question d
    Movie m = new Movie("Casino Royale", "Eon Productions", "PG-13");

}
