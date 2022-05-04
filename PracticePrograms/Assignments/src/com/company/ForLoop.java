package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int salary = 500;
        for(int index = 0; index <= num; index++){
            if(index < salary){
                System.out.println(index);
            }
        }
    }
}