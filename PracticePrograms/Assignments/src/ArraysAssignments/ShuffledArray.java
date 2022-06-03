package ArraysAssignments;

import java.util.Arrays;

public class ShuffledArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length/2;
        int[] newArr = new int[arr.length];

        int x = 0;
        for(int i = 0; i<arr.length; i++){
            if(i%2==0){
                newArr[i] = arr[x];
                x++;
            } else {
                newArr[i] = arr[x+n-1];
            }
        }

        System.out.println(Arrays.toString(newArr));
        System.out.println(Arrays.toString(shuffle(arr, newArr, n)));
    }
    static int[] shuffle(int[] arr, int[] newArr, int n){
        if(arr.length == 0){
            return new int[] {-1,-1};
        }
        int x = 0;
        for(int i = 0; i<n; i++){
            if(i%2==0){
                newArr[i] = arr[x];
                x++;
            } else {
                newArr[i] = arr[x+n-1];
            }
        }
        return newArr;
    }
}
