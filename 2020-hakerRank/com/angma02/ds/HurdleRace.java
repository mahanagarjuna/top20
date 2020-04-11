package com.angma02.ds;

import java.io.*;
import java.util.*;

public class HurdleRace {

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            if (max < height[i])
                max = height[i];
        }

        if (k > max)
            return 0;
        else
            return max - k;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        System.out.println("Result: " + result);

        scanner.close();
    }

}