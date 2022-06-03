package LinearSearch;

import java.sql.SQLOutput;
import java.util.Scanner;

// Check if an element exists in this array or not
public class ElementPresentOrNot {
    public static void main(String[] args){
        int[] arr = {1,3,2,4,42,131,123};

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        System.out.print(exists(num,arr));
    }
    static boolean exists(int num, int[] arr){
        boolean flag = false;
        for(int j:arr){
            if(num == j){
                return true;
            }
        }
        return flag;
    }
}
