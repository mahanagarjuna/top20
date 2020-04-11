package com.angma02.ds;

import java.io.*;
import java.util.*;

public class CatsMouse {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {

        String result = "Mouse C";
        int catA = 0;
        int catB = 0;
        if (x < z) {
            while (x < z) {
                catA++;
            }
        } else {
            catA = x;
            while (x > z) {
                catA--;
            }
        }
        if (y < z) {
            while (y < z) {
                catB++;
            }
        } else {
            catB = y;
            while (y > z) {
                catB--;
            }
        }

        if (catA < catB)
            return "Cat A";
        else if (catB < catA)
            return "Cat B";
        else
            return result;
    }

    public static void main(String[] args) throws IOException {

        int x = Integer.parseInt(args[0]);

        int y = Integer.parseInt(args[1]);

        int z = Integer.parseInt(args[2]);

        if (Math.abs(x - z) < Math.abs(y - z)) {
            System.out.println("Cat A");
        } else if (Math.abs(x - z) > Math.abs(y - z)) {
            System.out.println("Cat B");
        } else {
            System.out.println("Mouse C");
        }
    }

}