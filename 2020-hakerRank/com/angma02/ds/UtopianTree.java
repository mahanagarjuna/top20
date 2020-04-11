package com.angma02.ds;

import java.io.*;
import java.util.*;

public class UtopianTree {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {

        int i = 1, h = 1;

        while (i <= n) {
            if (i % 2 == 0)
                h = h + 1;
            else
                h = h * 2;

            i++;
        }

        return h;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

            System.out.println("Result: " + result);

        }
        scanner.close();
    }

}