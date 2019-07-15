package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try(
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fstream = new FileInputStream(reader.readLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                System.out.println(strLine);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        // напишите тут ваш код
    }
}