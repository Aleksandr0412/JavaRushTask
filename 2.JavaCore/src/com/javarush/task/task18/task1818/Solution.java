package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(s2), 1000);
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(s1, true));
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(s3), 1000);
        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(s1, true));
        byte[] buffer = new byte[1000];
        while (bufferedInputStream1.available() > 0){
            int count = bufferedInputStream1.read(buffer);
            bufferedOutputStream1.write(buffer, 0, count);
        }
        bufferedInputStream1.close();
        bufferedOutputStream1.close();
        while (bufferedInputStream2.available() > 0){
            int count = bufferedInputStream2.read(buffer);
            bufferedOutputStream2.write(buffer, 0, count);
        }
        bufferedInputStream2.close();
        bufferedOutputStream2.close();
        //



    }
}
