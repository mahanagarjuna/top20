package com.angma02.ds;

import java.io.*;
import java.util.*;

public class SavePrisoner {

    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {

        int result = m % n;

        result = (result + s - 1) % n;

        if (result == 0)
            return n;
        else
            return result;
    }

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(args[0]);

        int m = Integer.parseInt(args[1]);

        int s = Integer.parseInt(args[2]);

        int result = saveThePrisoner(n, m, s);

        System.out.println("Result: " + result);

    }

}