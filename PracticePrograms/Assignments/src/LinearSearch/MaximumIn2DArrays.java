package LinearSearch;

public class MaximumIn2DArrays {
    public static void main(String[] args){
        int[][] arr= {
            {1,2,3,234},
            {4,5,6,25},
            {7,8,9,1414}
        };
        System.out.println(maxIn2d(arr));
    }
    static int maxIn2d(int[][] arr){
        // base case
        if(arr.length == 0){
            return -1;
        }
        // maximum variable
        int max = Integer.MAX_VALUE;
        // max search
        for(int row = 0; row<arr.length;row++){
            for(int column = 0; column<arr[row].length; column++){
                if(arr[row][column] > max){
                    max = arr[row][column];
                }
            }
        }
        return max;
    }

}
