package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите полное имя");
        String string = reader.readLine();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(string));
        System.out.println("Введите полное имя2");
        zipFileManager.createZip(Paths.get(reader.readLine()));
    }
}
