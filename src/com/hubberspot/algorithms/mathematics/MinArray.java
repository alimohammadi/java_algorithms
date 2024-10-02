package com.hubberspot.algorithms.mathematics;

public class MinArray {

    public int findMinimum(int[] arr) {
        int min = arr[0]; // min will hold the minimum value of array

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 1, 2};

        MinArray ma = new MinArray();
        int minimumValue = ma.findMinimum(arr);

        System.out.print("minValue: " + minimumValue);
    }


}
