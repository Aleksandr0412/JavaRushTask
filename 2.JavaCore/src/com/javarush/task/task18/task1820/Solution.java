package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import javax.imageio.IIOException;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        while (fileInputStream.available() > 0){
            Double.parseDouble(fileInputStream.read())
        }
    }
}
