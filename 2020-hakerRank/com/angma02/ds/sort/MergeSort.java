package com.angma02.ds.sort;

import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array, int l, int h) {
        int mid;
        if (l == h)
            return;
        else if (l < h) {
            mid = (l + h) / 2;

            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, h);
            merge(array, l, mid, h);
        }
    }

    static void merge(int[] array, int l, int m, int r) {

        int n1 = m - l + 1;
        int n2 = r - m;

        // System.out.println("L:" + l + " M:" + m + " R:" + r);
        // System.out.println("N1:" + n1 + " N2:" + n2);

        int L[] = new int[n1];
        int R[] = new int[n2];

        // Populate Left Array
        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }
        // Populate Right Array
        for (int j = 0; j < n2; j++) {
            R[j] = array[m + 1 + j];
        }

        // Merge the two arrays

        int i = 0;
        int j = 0;

        // Starting of merged sub-array
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] array = { 5, 3, 2, 1, 6, 4, 8, 9, 7 };

        System.out.println("Array: " + Arrays.toString(array));

        mergeSort(array, 0, array.length - 1);

        System.out.println("MergeSorted Array: " + Arrays.toString(array));

    }

}