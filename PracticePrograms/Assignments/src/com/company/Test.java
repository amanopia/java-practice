package com.company;

import java.util.Scanner;

import java.util.Arrays;
public class Test {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String[] str = new String[4];

        for(int i = 0; i<str.length; i++){
            str[i] = in.next();
        }
        for(String st : str){
            System.out.print(st + " ");
        }
    }
}
