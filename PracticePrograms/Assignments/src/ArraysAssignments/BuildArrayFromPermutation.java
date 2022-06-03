package ArraysAssignments;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args){
        int[] arr = {0,3,1,4,5,2};
        int[] ans = new int[arr.length];
        System.out.println(Arrays.toString(permutedArr(arr, ans)));

    }
    static int[] permutedArr(int[] arr, int[] ans){
        if(arr.length == 0){
            return new int[]{-1};
        }
        for(int index= 0;index<arr.length; index++){
            if(arr[index] >= 0 && arr[index] < arr.length){
                ans[index] = arr[arr[index]];
            }
        }
        return ans;
    }
}
