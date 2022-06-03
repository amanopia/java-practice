package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args){
        int[][] arr = {
            {1,2,3},
            {4,5,6,25},
                {7,8,9}
        };
        int target = 25;
        System.out.println(Arrays.toString(searchIn2d(arr,target)));
    }

    static int[] searchIn2d(int[][] arr, int target ){
        if(arr.length == 0){
            return new int[] {-1,-1};
        }
        for(int row=0;row<arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                    // return {row,col} using this questions us about where have we declared the array
                }
            }
        }
        // answer not found
        return new int[]{-1,-1};
    }
}
