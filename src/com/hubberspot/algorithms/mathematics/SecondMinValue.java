package com.hubberspot.algorithms.mathematics;

public class SecondMinValue {

    public int findSecondMinValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] sampleArray = {13, 34, 2, 34, 33, 1};

        SecondMinValue secondMin = new SecondMinValue();

        int secondMinValue = secondMin.findSecondMinValue(sampleArray);

        System.out.println(secondMinValue);

    }
}
