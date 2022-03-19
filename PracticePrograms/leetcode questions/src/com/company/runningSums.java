package com.company;

import java.util.Arrays;

public class runningSums {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("The running sum: ");
        int[] newArr = new int[arr.length];
        System.arraycopy(runSum(arr),1, newArr, 0, arr.length);
        System.out.print(Arrays.toString(runSum(arr)));
        System.out.print(Arrays.toString(newArr));
    }
    static int[] runSum(int[] arr){
        int[] nums = new int[arr.length+1];

        for(int index = 0; index<arr.length; index++){
            nums[index+1] = arr[index] + nums[index];
        }
        return nums;
    }
}
