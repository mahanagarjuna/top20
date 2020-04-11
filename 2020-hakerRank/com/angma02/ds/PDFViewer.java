package com.angma02.ds;

import java.io.*;
import java.util.*;

public class PDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        int area = 0;
        String str = "abcdefghijklmnopqrstuvwxyz";

        int max = 1;
        char[] word_c = word.toCharArray();

        for (int i = 0; i < word_c.length; i++) {
            int index = str.indexOf(word_c[i]);
            if (max < h[index])
                max = h[index];
        }

        area = max * word.length();

        return area;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        System.out.println("Result: " + result);

        scanner.close();
    }
}