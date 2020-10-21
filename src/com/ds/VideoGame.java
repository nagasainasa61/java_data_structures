package com.ds;

public class VideoGame {

    private String title;
    private int year;
    private String rating;
    private String[] platforms;

    public VideoGame(String title, int year, String rating, String[] platforms){
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }

    public void paintball(){
        System.out.println(this.title);
        System.out.println(this.year);
        System.out.println(this.rating);
    }
}
