package com.angma02.ds;

import java.io.*;
import java.util.*;

public class ViralAdvertising {
    // Complete the viralAdvertising function below.
    static int viralAdvertising(int n) {
        double count = 5 / 2;
        double cummilative = count;
        for (int i = 1; i < n; i++) {
            count = count * 3;

            double dCount = count / 2;
            count = Math.floor(dCount);
            cummilative = cummilative + count;
        }

        return (int) cummilative;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        System.out.println("Result: " + result);

        scanner.close();
    }
}