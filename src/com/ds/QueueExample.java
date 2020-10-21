package com.ds;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample{
    public static void main(String [] args){
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 11; i++) {
            queue.add(i);
        }

        System.out.println("Elements in the queue : "+ queue);

        int removed = queue.poll();
        System.out.println("the removed item is : " + removed);

        int top = queue.peek();
        System.out.println("the top item is : " + top);

    }
}