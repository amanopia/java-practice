package com.company;

public class testPro {
    public static void main(String[] args){
        int[] arr = {-20,-17,-15,-10,-8,-3,-2,-1,0,1,2,3,4,8,9,10,11,12};
        int max = arr[0];
        for(int index = 0; index < arr.length; index++){
            if(arr[index] > max){
                max = arr[index];
            }
        }
//        System.out.println(max);
    }

}
