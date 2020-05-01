package com.angma02.ds;

import java.io.*;
import java.util.*;

public class AppendDelete {
    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        int commonString = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i))
                commonString++;
            else
                break;
        }

        // CASE A
        if ((s.length() + t.length() - 2 * commonString) > k) {
            return "No";
        }
        // CASE B
        else if ((s.length() + t.length() - 2 * commonString) % 2 == k % 2) {
            return "Yes";
        }
        // CASE C
        else if ((s.length() + t.length() - k) < 0) {
            return "Yes";
        }
        // CASE D

        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        System.out.println("Result: " + result);

        scanner.close();
    }
}