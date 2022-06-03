package LinearSearch;

public class MaximumIn2DArrays {
    public static void main(String[] args){
        int[][] arr= {
            {1,2,3,234},
            {4,5,6,25},
            {7,8,9,1414}
        };
        System.out.println(maxIn2d(arr));
        int a = 0x100;
        System.out.println(a);
    }
    static int maxIn2d(int[][] arr){
        // base case
        if(arr.length == 0){
            return -1;
        }
        // maximum variable
        int max = Integer.MIN_VALUE;
        // max search
        for(int[] row: arr){
            for(int column : row){
                if(column > max){
                    max = column;
                }
            }
        }
        return max;
    }

}
