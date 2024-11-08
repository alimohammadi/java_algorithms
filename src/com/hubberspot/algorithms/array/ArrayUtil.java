package com.hubberspot.algorithms.array;


public class ArrayUtil {
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5]; //default value
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 3;
        myArray[3] = 4;
        printArray(myArray);

        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = {5, 10, 12, 2};

        System.out.println(arr[0]);
//        myArray[5] = 10;
    }

    public void printArray2(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("final for");
    }

    public void resizeArray(int[] arr, int capacity) {
        int[] temp = new int[capacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr[0] = 100;

//        arr = temp;
//        return temp;
    }

    int[] arr2 = {1, 2, 34};
//    arr2={2,}

    public static void main(String[] args) {
//        ArrayUtil arrayUtil = new ArrayUtil();
//
//        arrayUtil.arrayDemo();

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.printArray2(new int[]{1, 2, 13, 9, 5});

        int[] sampleArr = new int[]{1, 2, 3};
        arrayUtil.resizeArray(sampleArr, 10);

        System.out.println(sampleArr[0]);

    }
}