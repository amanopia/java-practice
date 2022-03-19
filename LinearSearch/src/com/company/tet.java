package com.company;

public class tet {
    public static void main(String[] args) {
        int[] arr = {1,89,314,1334,11123,4673,90,17};

        System.out.print(findNumbers(arr));

    }
    static int findNumbers(int[] arr){
        int count = 0;
        for(int num: arr){
            if(even(num)){
             count++;
            }
        }
        return count;
    }
    // Return if the number has even number of digits or not
    static boolean even(int num){
        int numberOfDigits = digits2(num);

        return numberOfDigits % 2 == 0;
    }
    //count number of digits
    static int digits2(int num){
        return (int)(Math.log10(num) + 1);
    }
    static int digits(int num)
    {
      int counter = 0;
      while(num>0){
          num = num/10;
          counter++;
      }
      return counter;
    }
    static int counter(int[] arr){
        int count = 0;
        int evenCounter = 0;
        for(int index = 0; index<arr.length; index++){
            int num = arr[index];
            while(num>0){
                num = num/10;
                count++;
            }
            if(count%2 == 0){
                evenCounter += 1;
            } else {
                count = 0;
            }
        }
        return evenCounter;

    }
}
