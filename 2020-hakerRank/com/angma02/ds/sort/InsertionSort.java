package com.angma02.ds.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = new int[] { 5, 3, 2, 1, 6, 4, 8, 9, 7 };

        int[] result = insertionSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(result));

    }

    /**
     * 
     * @param a
     * @return array
     */
    public static int[] insertionSort(int[] a) {
        int temp;
        int hole;

        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            hole = i;

            while (hole > 0 && a[hole - 1] > temp) {
                a[hole] = a[hole - 1];
                hole--;
            }
            a[hole] = temp;
        }
        return a;
    }
}