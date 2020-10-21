package com.ds;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample{
    public static void main(String args[]){

        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};

        VideoGame game1 = new VideoGame("Battle field 1",2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon Sun",   2016, "E", platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda",2017, "E", platform2);

        //Initializing an ArrayList
        ArrayList<VideoGame> games = new ArrayList<>();

        //adding a new element in the ArrayList
        games.add(game1);
        games.add(game2);
        games.add(0,game3);

        //This is how we take the iterator on ArrayList
        Iterator games_iterator = games.iterator();

        //Using iterator to loop over all the elements of an ArrayList
        //forEach() can be used for the same purpose.
        while(games_iterator.hasNext()){
            System.out.println(games_iterator.next());
        }
    }
}