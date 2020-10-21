package com.ds;

import java.util.ArrayList;
import java.util.Iterator;

public class GroceryChallenge{
    public static void main(String[] args) {
        ArrayList<String> groceryItems = new ArrayList();
        ArrayList<String> secondList = new ArrayList();

        groceryItems.add("eggs");
        groceryItems.add("biscuits");
        groceryItems.add("chocolates");
        groceryItems.add("dry fruits");
        groceryItems.add("bacon");

        System.out.println(groceryItems);

        secondList.add("nuts");
        secondList.add("dal");
        secondList.add("milk");

        System.out.println(secondList);

        groceryItems.addAll(secondList);

        System.out.println(groceryItems);

        Iterator iterator = groceryItems.iterator();

        while(iterator.hasNext()){
            if(iterator.next() == "dal"){
                iterator.remove();
            }
        }

        if(groceryItems.contains("milk")){
            groceryItems.remove("milk");
        }

        System.out.println(groceryItems);
    }
}