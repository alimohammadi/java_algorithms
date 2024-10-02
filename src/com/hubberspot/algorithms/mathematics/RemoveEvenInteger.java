package com.hubberspot.algorithms.mathematics;

public class RemoveEvenInteger {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("hell");
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int indx = 0;

        for (int i = 0; i < result.length; i++) {
            if (arr[i] % 2 != 0) {
                result[indx] = arr[i];
                indx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 12, 4, 6, 5};
        printArray(arr);
        printArray(removeEven(arr));
    }
}
