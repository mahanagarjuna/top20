package com.angma02.ds.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = new int[] { 5, 3, 2, 1, 6, 4, 8, 9, 7 };

        System.out.println("Array: " + Arrays.toString(array));

        int[] result = bubbleSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(result));
    }

    public static int[] bubbleSort(int[] a) {

        int temp;
        int length = a.length;
        int count = 0;
        while (count < length) {
            for (int i = 0; i < length - 1; i++) {
                temp = a[i];
                if (temp > a[i + 1]) {
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
            count++;
        }

        return a;
    }

}