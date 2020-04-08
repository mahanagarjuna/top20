package com.angma02.ds;

import java.io.*;
import java.util.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int result = -1;
       int diff = b;
      
        for(int i=0; i< keyboards.length; i++) {
            for(int j=0; j < drives.length; j++) {
                int tSum = keyboards[i] + drives[j];
                int tDiff = b - tSum;
                if(tDiff >= 0 && tDiff < diff){
                    diff = tDiff;
                    result = tSum;
                }

            }
        }
       
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int b = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        System.out.println("Budget: " + b + " -- NCols: " + n + " -- MCol: " + m);

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[i]);
            keyboards[i] = keyboardsItem;
        }

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int drivesItem = Integer.parseInt(drivesItems[i]);
            drives[i] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */
        System.out.println("Before call...");

        System.out.println("Keyboard proces: " + Arrays.toString(keyboards));
        System.out.println("Drivers prices: " + Arrays.toString(drives));
       

        int moneySpent = getMoneySpent(keyboards, drives, b);

        System.out.println("MoneySpent: " + moneySpent);

        // bufferedWriter.write(String.valueOf(moneySpent));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();        
    }

}