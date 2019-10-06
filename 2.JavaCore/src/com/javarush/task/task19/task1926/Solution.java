package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(name));
        String str;
        while (( str = reader1.readLine())!= null) {
            char[] charArr = str.toCharArray();
            for (int i = charArr.length - 1; i >= 0; i--) {
                System.out.print(charArr[i]);
            }
            System.out.println();
        }
        reader1.close();

    }
}
