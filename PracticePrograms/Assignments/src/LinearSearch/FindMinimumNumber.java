package LinearSearch;

public class FindMinimumNumber {
    public static void main(String[] args){
        int[] arr = {1,2,3,-43,4,5,6,7,8};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        // base case
        if(arr.length == 0){
            return -1;
        }
        int minimum = arr[0];
        for(int i:arr){
            if(i < arr[0]){
                minimum = i;
            }
        }
        return minimum;
    }
}
