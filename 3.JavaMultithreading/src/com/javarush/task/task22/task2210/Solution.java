package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer st = new StringTokenizer(query, delimiter);
        List<String> arrayList = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arrayList.add(st.nextToken());
        }
        String[] result = new String[arrayList.size()];
        arrayList.toArray(result);
        return result;
    }
}
