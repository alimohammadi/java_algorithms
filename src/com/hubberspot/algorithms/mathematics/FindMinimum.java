package com.hubberspot.algorithms.mathematics;

public class FindMinimum {
    public int findMinimum(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] arr) {
        FindMinimum findMinimum = new FindMinimum();

        int[] sampleArray = {1, 4, 10, 3, 2, 0, -1};

        int min = findMinimum.findMinimum(sampleArray);

        System.out.println(min);
    }
}
