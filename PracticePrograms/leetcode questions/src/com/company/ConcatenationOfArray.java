package com.company;
import java.util.Arrays;
public class ConcatenationOfArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,5,76};
        int lengthArr = nums.length;
        int[] newArr = new int[2 * lengthArr];
        System.arraycopy(nums, 0, newArr, 0, lengthArr);
        System.arraycopy(nums, 0, newArr, lengthArr, lengthArr);
        System.out.println(Arrays.toString(newArr));
//
//        for(int index = 0; index<lengthArr; index++){
//            newArr[index] = nums[index];
//            for(int i = index + lengthArr; i<2*lengthArr; i++){
//                newArr[i] = nums[index];
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

    }
}
