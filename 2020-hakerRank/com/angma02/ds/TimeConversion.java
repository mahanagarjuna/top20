package com.angma02.ds;

import java.io.*;
import java.util.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String amOrPm = s.substring(8);
    
        int hh = Integer.parseInt(s.substring(0,2));
        String finalTime = null;
        String time = null;
        if(amOrPm.equals("PM")){
            if(hh == 12){
                time = String.valueOf(hh);
            }else {
                hh = hh + 12;
                time = String.valueOf(hh);
            }

            finalTime = time+s.substring(2, 8);
            System.out.println("24hrs Format: "+ finalTime);
        } else { //AM case
            if(hh == 12) {
                finalTime = "00"+s.substring(2, 8);
            } else {
                finalTime = s.substring(0, 8);
            }
            System.out.println("24hrs Format: "+ finalTime);
        }
        return finalTime;
    }

    static String timeConversion2(String s) {
        //String t1 = "01:00:00AM";
        String arr [] = s.split(":");
        StringBuilder res = new StringBuilder();
        int hrs = 0;
        if(arr[arr.length-1].contains("PM")) {
            hrs= Integer.parseInt(arr[0]) + 12;
            if(hrs==24) {
                hrs = 0;
                arr[0] = "00";
            }
            else
                arr[0] = String.valueOf(hrs);

        }

        String last= arr[arr.length-1];
        last = last.substring(0, 2);
        arr[arr.length-1] = last;

        for(int i=0; i<arr.length; i++ ) {
            res.append(arr[i]);
            if(i<arr.length-1)
            res.append(":");
        }


        System.out.println( res);
        return res.toString();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}