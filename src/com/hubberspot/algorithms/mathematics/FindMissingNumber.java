package com.hubberspot.algorithms.mathematics;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr){
        int n = arr.length+1;
        int sum = n *(n+1)/2;

        for (int num: arr) {
            sum = sum - num;
        }

        return sum;
    }

    public static void main(String[] arr){
//        FindMissingNumber findMissingNumber = new FindMissingNumber();

        int[] sample = {1, 3, 2,5};

        int missedNumber = findMissingNumber(sample);

        System.out.println(missedNumber);
    }
}
