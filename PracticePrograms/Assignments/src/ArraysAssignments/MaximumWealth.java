package ArraysAssignments;

public class MaximumWealth {
    public static void main(String[] args){
        int[][] arr = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println(richest(arr));
    }
    static int richest(int[][] accounts){
        int max_wealth = 0;
        int sum = 0;

        for(int i = 0; i<accounts.length; i++){
            for(int j =0; j<accounts[i].length; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max_wealth){
                max_wealth = sum;
                sum = 0;
            }
        }
        return max_wealth;
    }


}
