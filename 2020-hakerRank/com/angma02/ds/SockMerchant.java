package com.angma02.ds;

import java.io.*;
import java.util.*;

public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int result=0;
       
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < ar.length; i++) {
            String key = String.valueOf(ar[i]);
            System.out.println("Key: " + key);
            if(!map.containsKey(key)) {
                System.out.println("in If...");
                map.put(key, 1);
            } else{
                int temp = map.get(key).intValue();
                System.out.println("in Else... " + temp);
                map.put(key, ++temp);
            }
        }


        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry mapElement = (Map.Entry)itr.next();

            String key = (String)mapElement.getKey();
            Integer val = (Integer)mapElement.getValue();

            System.out.println(key + " : " + val);
            result = result + (val/2);
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("Result: " + result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}