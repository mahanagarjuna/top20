package com.angma02.ds;

import java.io.*;
import java.util.*;

public class Leaderboard {

    // Complete the climbingLeaderboard function below.
    static void climbingLeaderboard(int[] scores, int[] alice) {

        // int[] result = new int[alice.length];

        List<Integer> sortedList = new ArrayList<Integer>();

        for (int i = 0; i < scores.length; i++) {
            sortedList.add(scores[i]);
        }

        Collections.sort(sortedList, Collections.reverseOrder());

        int ind;
        for (int i = 0; i < alice.length; i++) {
            ind = Collections.binarySearch(sortedList, alice[i], Collections.reverseOrder());
            if (ind < 0) {
                ind = Math.abs(ind);
            } else {
                ind++;
            }
            System.out.println(ind);
        }
        /*
         * List<Integer> ranks = new ArrayList<Integer>(); // First ranks is always 1.
         * ranks.add(0, 1); int temp = 1; for (int i = 1; i < scores.length; i++) { if
         * (scores[i - 1] == scores[i]) { ranks.add(temp); } else { ranks.add(++temp); }
         * }
         * 
         * System.out.println("Ranks: " + ranks.toString());
         * 
         * for (int i = 0; i < alice.length; i++) { int tempRank = 1; for (int j = 0; j
         * < scores.length; j++) { if (alice[i] < scores[j]) { tempRank++; if (tempRank
         * > scores.length) { result[i] = ; System.out.println("Rank in game " + i +
         * " is:" + j); } } else{ result[i] = tempRank; } } //
         * System.out.println("Temp Rank: " + tempRank); }
         */
        // return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        climbingLeaderboard(scores, alice);

        // for (int i = 0; i < result.length; i++) {
        // bufferedWriter.write(String.valueOf(result[i]));

        // if (i != result.length - 1) {
        // bufferedWriter.write("\n");
        // }
        // }

        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }

}