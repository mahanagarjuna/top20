package com.angma02.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);
        int currentLen = 1;
        int maxLen = currentLen;
        Integer fInteger = a.get(0);

        for (int i = 0; i < a.size() - 1; i++) {
            if (Math.abs(a.get(i) - a.get(i + 1)) <= 1 && Math.abs(fInteger - a.get(i + 1)) <= 1) {
                currentLen++;
            } else {
                if (maxLen < currentLen)
                    maxLen = currentLen;
                currentLen = 1;
                fInteger = a.get(i + 1);
            }

            // special case when maxLength needs to be set to currLength
            // when the last element checked is part of the longest boundary and logic above
            // never enters the else statement
            if (i + 1 == a.size() - 1 && maxLen < currentLen)
                maxLen = currentLen;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++) {
            list.add(Integer.parseInt(args[i]));
        }

        System.out.println("Input: " + list.toString());

        int result = pickingNumbers(list);

        System.out.println("Result: " + result);
    }

}