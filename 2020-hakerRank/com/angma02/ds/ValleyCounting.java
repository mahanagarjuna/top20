package com.angma02.ds;

import java.io.IOException;

public class ValleyCounting {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int cnt =0, seaLevel =0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='U') {
                cnt ++; 
            } else cnt--;

            if(cnt == 0 && s.charAt(i) == 'U') {
                seaLevel++;
            }

        }
        System.out.println("Sea Level: " + seaLevel + "  Cnt:" + cnt);
        return seaLevel;
    }


    public static void main(String[] args) throws IOException {
        
        int n = Integer.parseInt(args[0]);
        String s = args[1].toString();

        int result = countingValleys(n, s);

    }

}