package com.ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample{
    public static void main(String []args){

        LinkedList<String> states =  new LinkedList<String>();

        states.add("Karnataka");
        states.add("Telangana");
        states.add("Madhya Pradesh");

        states.addFirst("Delhi");

        System.out.println(states);
        System.out.println(states.getLast());

        ListIterator iterator = states.listIterator(states.size());

        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}