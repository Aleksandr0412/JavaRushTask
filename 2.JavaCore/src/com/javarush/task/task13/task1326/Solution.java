package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));
        String k;
        List<Integer> intList = new ArrayList<>();
        while (( k = (reader.readLine())) != null) {
            int l = Integer.parseInt(k);
            if (l % 2 == 0) intList.add(l);
        }
        Collections.sort(intList);
        for (int s: intList) {
            System.out.println(s);
        }
        reader.close();
    }
}
