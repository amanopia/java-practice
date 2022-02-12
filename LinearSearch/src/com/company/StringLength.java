package com.company;

import java.util.Arrays;

public class StringLength {
    public static void main(String[] args){
        String name = "Aman";
        char target = 't';
        String upper = name.toUpperCase();
        // Characters are represented using single inverted commas
        System.out.println(search3(name,target));
//        System.out.print(name.charAt(2));
//        System.out.print(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str, char target){
        char upper = java.lang.Character.toUpperCase(target);
        if(str.length() == 0){
            return false;
        }
        for(int index = 0; index<str.length(); index++){
            if(str.charAt(index) == upper){
                return true;
            }
        }
      return false;
    }

    static int search2(String str, char target){
        if(str.length() == 0){
            return -1;
        }
        for(int index = 0; index<str.length(); index++){
            if(target == str.charAt(index)){
                return index;
            }
        }
        return -1;
    }

    static boolean search3(String str, char target){
        for(char ch : str.toCharArray()){
            if(ch == target){
              return true;
            }
        }
        return false;
    }
}

