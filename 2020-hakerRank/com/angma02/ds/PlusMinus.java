package com.angma02.ds;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double pve =0, nve=0, zzs = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) pve++;
            else if(arr[i] < 0) nve++;
            else zzs++;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        
        System.out.println(df.format(pve/arr.length));
        System.out.println(df.format(nve/arr.length));
        System.out.println(df.format(zzs/arr.length));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
