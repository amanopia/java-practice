package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        for(int i =0; i<5;i++){
            list.add(new ArrayList<>());
        }
        // adding elements
        for(int i =0; i<3; i++){
            for(int j =0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

    }
}
