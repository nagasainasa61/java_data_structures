package com.ds;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class InsertionSort {
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);

        System.out.println(numbers);

        int key = 0 ;
        int i =0 ;

        for ( int j = 1; j < numbers.size(); j++){
            key = numbers.get(j);
            i = j - 1;
            while(i>=0 && numbers.get(i)>key){
                numbers.set(i+1, numbers.get(i));
                i = i - 1;
            }
            numbers.set(i+1, key);
        }

        System.out.println(numbers);
    }
}
