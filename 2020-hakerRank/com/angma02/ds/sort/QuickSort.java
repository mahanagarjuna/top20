package com.angma02.ds.sort;

import java.util.Arrays;

public class QuickSort {

    static int[] array = { 3, 1, 5, 2, 6, 9, 8, 7 };

    public static void main(String[] args) {

        quickSort(0, array.length - 1);

        System.out.println("Sorted: " + Arrays.toString(array));
    }

    public static void quickSort(int l, int h) {
        if (l == h)
            return;
        int p = partition(l, h);

        quickSort(l, p);
        quickSort(p + 1, h);

    }

    private static int partition(int l, int h) {
        int pivot = array[l];
        int i = l;
        int j = h;

        while (i < j) {
            do {
                i++;
            } while (array[i] <= pivot);

            do {
                j--;
            } while (array[j] > pivot);
        }

        if (i < j) {
            swap(i, j);
        }

        swap(l, j);

        return j;

    }

    static void swap(int i, int j) {
        int temp = array[i];

        array[i] = array[j];

        array[j] = temp;
    }

}