package com.hubberspot.algorithms.mathematics;

public class MoveZeros {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public void moveZero(int[] arr, int n) {
        int j = 0; // Focus on zeros elements
        for (int i = 0; i < arr.length; i++) { // "i" focus on non zero elements
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (arr[j] != 0) {
                j++;
            }
        }

    }

    public static void main(String[] arr) {
        int[] sampleArray = {1,0,22,3,0,4,5,0,4};

        MoveZeros moveZeros = new MoveZeros();

        moveZeros.moveZero(sampleArray, sampleArray.length);

        moveZeros.printArray(sampleArray);
//        System.out.println(sampleArray);

    }
}
