package LinearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start Index: ");
        int start = in.nextInt();
        System.out.print("Enter end Index: ");
        int end = in.nextInt();
        System.out.print("Enter target element: ");
        int target = in.nextInt();
        System.out.println(presentInRange(start, end, arr, target));
    }
    static boolean presentInRange(int start, int end, int[] arr, int target){
        try{
            if(arr.length == 0){
                return false;
            }
            for(int i =start; i<=end;i++){
                if(arr[i] == target){
                    return true;
                }
            }

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught. Index out of bound");
        }
        finally {
            System.out.println("Renter index");
        }

        return false;
    }
}
