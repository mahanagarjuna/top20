package com.angma02.ds;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.joining;

public class GradingStudents {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = GradeResult.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

}

class GradeResult {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        
        List<Integer> res = new ArrayList<Integer>();
        
        for(Integer in : grades){
            if(in.intValue() >= 38) {
                int mod = (in.intValue() % 5);
                if( mod !=0 && mod >= 3) {
                    int diff = 5 - mod;
                    res.add(in.intValue()+diff);
                } else
                    res.add(in.intValue());
            } else {
                res.add(in.intValue());
            }
            
        }
        System.out.println(res.toString());
        return res;
    }

}