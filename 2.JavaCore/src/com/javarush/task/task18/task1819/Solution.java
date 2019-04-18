package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(s1);
        FileInputStream fileInputStream2 = new FileInputStream(s2);
        byte[] buffer1 = new byte[fileInputStream1.available()];
        fileInputStream1.read(buffer1);
        fileInputStream1.close();

        byte[] buffer2 = new byte[fileInputStream2.available()];
        fileInputStream2.read(buffer2);
        fileInputStream2.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(s1);
        fileOutputStream1.write(buffer2);
        fileOutputStream1.close();

        FileOutputStream fileOutputStream2 = new FileOutputStream(s1, true);
        fileOutputStream2.write(buffer1);
        fileOutputStream2.close();

    }
}
