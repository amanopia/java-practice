package com.company;

import java.util.Scanner;

public class ReversingAString{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = in.next();

        char ch;
        String str = "";

        for(int index=text.length()-1; index>=0; index--){
            str = str + text.charAt(index);
        }
        System.out.print(str);
    }
}