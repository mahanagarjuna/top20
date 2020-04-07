package com.angma02.ds;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class MigratoryBirds {
        // Complete the migratoryBirds function below.
        static int migratoryBirds(List<Integer> arr) {
            int res = 0;
            
            int[] resArray = new int[5];
            
            for(int i = 0; i< 5; i++) resArray[i] = 0;

            for(Integer in : arr){
                switch (in) {
                    case 1:
                        resArray[0] += 1;
                        break;
                    case 2:
                        resArray[1] += 1;
                        break;
                    case 3:
                        resArray[2] += 1;
                        break;
                    case 4:
                        resArray[3] += 1;
                        break;
                    case 5:
                        resArray[4] += 1;
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Resutls Array: " + Arrays.toString(resArray));
            int max =0;
            for(int i=0; i< resArray.length; i++){
                if(max < resArray[i]) {
                    max = resArray[i];
                    res = i+1;
                }
            }
            System.out.println("Result: " + res);
            return res;
        }
    
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
    
            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
    
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    
            int result = migratoryBirds(arr);
    
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
    
            bufferedReader.close();
            bufferedWriter.close();
        }
}