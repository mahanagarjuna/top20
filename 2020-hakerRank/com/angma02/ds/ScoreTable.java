package com.angma02.ds;

import java.io.*;
import java.util.*;

public class ScoreTable {
    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {

        int hScore = 0;
        int lScore = 0;
        int hTemp = scores[0];
        int lTemp = scores[0];
        for(int i=1; i< scores.length; i++)
        {
            if(hTemp < scores[i]) {
                hTemp = scores[i];
                hScore++;
            }

            if(lTemp > scores[i]) {
                lTemp = scores[i];
                lScore++;
            }
        }
        int[] res = {hScore, lScore};
        System.out.println(hScore + " " + lScore);
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}