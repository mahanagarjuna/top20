package com.angma02.ds;

import java.io.*;
import java.util.*;

public class DaysMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (int i1 = i; i1 <= j; i1++) {

            int rev = 0;
            int temp = i1;
            while (temp != 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            int diff = Math.abs(i1 - rev);

            double goodday = (double) diff / (double) k;
            System.out.println("Good day: " + goodday);
            if (goodday == Math.round(diff / k)) {
                result++;
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        System.out.println("Result: " + result);

        scanner.close();
    }

}