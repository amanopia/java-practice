package com.company;

public class SumProductDifference {
    public static void main(String[] args){

        int num = 1324;

        int sum = 0;
        int product = 1;

        while(num>0){
            sum = sum + num % 10;
            product = product * (num % 10);
            System.out.println(sum + " " + product);
            num = num/10;
        }
        System.out.println(product - sum);

    }
}
