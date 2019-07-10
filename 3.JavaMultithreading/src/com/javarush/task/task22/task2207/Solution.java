package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream in = new FileInputStream(reader.readLine())
        ) {
            String strLine;
            Pair pair;
            List<String> strList = new ArrayList<>();
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(in));
            while ((strLine = reader1.readLine()) != null){
                strList.addAll(Arrays.asList(strLine.split(" ")));
            }
            for (int i = 0; i < strList.size(); i++)
                for (int j = 0; j < strList.size();j++)
                {
                    if (strList.get(i)==null || strList.get(j)==null) continue;
                    StringBuilder sb = new StringBuilder(strList.get(i)).reverse();
                    pair = new Pair();

                    if (sb.toString().equals(strList.get(j)) && i != j)
                    {
                        pair.first = strList.get(i);
                        pair.second = strList.get(j);
                        result.add(pair);
                        strList.set(i,null);
                        strList.set(j,null);
                    }
                }
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
    public static class Pair {

        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
