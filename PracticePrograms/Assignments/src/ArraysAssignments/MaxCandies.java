package ArraysAssignments;
import java.util.Arrays;

public class MaxCandies {
    public static void main(String[] args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(Arrays.toString(candyArray(candies, extraCandies)));
    }
    static boolean[] candyArray(int[] arr, int exCan){
        boolean[] empArr = new boolean[arr.length];
        if(arr.length == 0){
            return new boolean[] {true};
        }
        for(int outer = 0; outer<arr.length; outer++){
            boolean value = true;
            for(int inner = 0; inner<arr.length; inner++){
                if(arr[outer] + 3 > arr[inner] == false){
                    value = false;
                }
            }
            empArr[outer] = value;
        }
        return empArr;
    }
}
