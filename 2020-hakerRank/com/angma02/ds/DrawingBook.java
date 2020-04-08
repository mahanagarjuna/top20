package com.angma02.ds;

import java.io.*;

public class DrawingBook {
    /*
     * Complete the pageCount function below.
     */
    // static int pageCount(int n, int p) {
    //     int result = 0;
        
    //     if(n==p || p==1) return result;

    //     if(n/2 < p){
    //         result = Math.abs (n-(p+1));
    //     } else {
    //         result = Math.abs (p-2);
    //     }

    //     return result;
    // }


    
    static int pageCount(int n, int p) {
    
        int mid = n/2;
        int midPage = p/2;
        int target = mid - midPage;

        return Math.min (target, midPage);
     
    }


    // static int pageCount(int n, int p) {
        
    //     int pg1 = Math.abs (p/2);
    //     if(n/2 == 0) n++;
    //     int pg2 = Math.abs( (p-n)/2 );
    //     return pg1 < pg2 ? pg1 : pg2;  
    // }

    public static void main(String[] args) throws IOException {
       

        int result = pageCount(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        System.out.println("Result: " + result);

    }
}