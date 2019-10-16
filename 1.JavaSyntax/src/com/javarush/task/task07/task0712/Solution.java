package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> strList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strList.add(reader.readLine());
        }
        int tempMin = 0, tempMax = 0, min = strList.get(0).length(), max = strList.get(0).length();
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i).length() < min) {
                min = strList.get(i).length();
                tempMin = i;
            }
            if (strList.get(i).length() > max) {
                max = strList.get(i).length();
                tempMax = i;
            }
        }
        if (tempMin < tempMax) {
            System.out.println(strList.get(tempMin));
        } else System.out.println(strList.get(tempMax));
    }
}