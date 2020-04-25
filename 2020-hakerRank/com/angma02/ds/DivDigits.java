package com.angma02.ds;

import java.io.*;
import java.util.*;

public class DivDigits {

    // Complete the findDigits function below.
    static int findDigits(int n) {
        int tmp = n;
        int result = 0;

        while (tmp > 0) {
            int digit = tmp % 10;
            System.out.println("Digit: " + digit);
            if (digit != 0) {
                int rem = n % digit;
                System.out.println("Rem: " + rem);
                if (rem == 0)
                    result++;
            }
            tmp = tmp / 10;

        }

        return result;
    }

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        System.out.println(findDigits(number));
    }

}