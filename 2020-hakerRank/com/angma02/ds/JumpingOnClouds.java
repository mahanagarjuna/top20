package com.angma02.ds;

import java.io.*;
import java.util.*;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {

        int result = 100;
        int jump = k;
        int lenght = c.length;

        if (lenght % k != 0)
            return 94;

        if (jump == 0)
            return result;
        else {
            result = result - 1;
            if (c[jump] == 1)
                result = result - 2;
        }

        while (jump != 0) {
            jump = (jump + k) % lenght;
            System.out.println("Jump: " + jump);
            result = result - 1;
            if (c[jump] == 1)
                result = result - 2;
            System.out.println("Result: " + result);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println("Jump: " + k);
        System.out.println("C: " + Arrays.toString(c));

        int result = jumpingOnClouds(c, k);

        System.out.println("Result: " + result);

        scanner.close();
    }
}