package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        // Creating an ArrayList
        // In an ArrayList we do not create objects using the primitive data types.
        // Instead, we use Wrapper classes to declare a type for the objects
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(77);
        list.add(30);
        list.add(77);
        list.add(30);
        list.add(77);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(0, 839);
        System.out.println(list);

        for(int i =0 ;i<5;i++){
            list.add(i);
        }
        System.out.println(list);
        for(int i = 0; i<11; i++){
            System.out.println(list.get(i));
        }
    }
}
