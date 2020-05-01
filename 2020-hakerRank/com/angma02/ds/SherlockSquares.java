package com.angma02.ds;

import java.io.*;
import java.util.*;

public class SherlockSquares {

    // Complete the squares function below.
    static int squares(int a, int b) {

        // Double sqrt;
        int result = 0;
        // for (int i = a; i <= b; i++) {
        // sqrt = Math.sqrt(i);
        // Math.c
        // // System.out.println("Sqrt: " + sqrt);
        // if (sqrt.toString().endsWith(".0"))
        // result++;
        // }

        result = (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] ab = scanner.nextLine().split(" ");

            int a = Integer.parseInt(ab[0]);

            int b = Integer.parseInt(ab[1]);

            long startTime = System.currentTimeMillis();
            int result = squares(a, b);

            long endTime = System.currentTimeMillis();
            System.out.println("Total Time (s): " + (endTime - startTime) / 1000);

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

}