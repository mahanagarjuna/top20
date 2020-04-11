package com.angma02.ds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Chocolate {

    
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int temp = 0;
        int res = 0;
        for(int i =0; i < s.size(); i++) {
            temp += s.get(i);
            // if(temp == d) {
            //     res++;
            //     break;
            // }
            for(int j=i+1; j < m; j++){
                temp += s.get(j);
                // if(temp == d) {
                //     res++;
                //     break;
                // }
            }
            if(temp == d){
                res++;
            }
            temp = 0;
        }
        return res;
    }

    static int birthday2(List<Integer> s, int d, int m) {
        int[] sum = new int[s.size()+1];
        int count = 0;
        sum[0] = 0;

        for(int i= 0; i< s.size(); i++){
            sum[i+1] = sum[i] + s.get(i);
        }

        for(int i=0;i<=s.size()-m;i++){
            if(sum[i+m]-sum[i]==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(dm[0]);

        int m = Integer.parseInt(dm[1]);

        int result = birthday2(s, d, m);

        System.out.println("Result: " + result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}