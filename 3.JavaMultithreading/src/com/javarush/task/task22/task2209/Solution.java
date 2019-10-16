package com.javarush.task.task22.task2209;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //...
        BufferedReader readerConsol = new BufferedReader(new InputStreamReader(System.in));
        String fileName = readerConsol.readLine();
        readerConsol.close();

        BufferedReader readerFile = new BufferedReader(new FileReader(fileName));
        ArrayList<String> wordsList = new ArrayList<>();
        while (readerFile.ready()) {
            wordsList.addAll(Arrays.asList(readerFile.readLine().split(" ")));
        }
        readerFile.close();
        String[] words = wordsList.toArray(new String[wordsList.size()]);

        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        for (int i = 1; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(words[i].length()) == words[j].charAt(0) ||
                        Character.toLowerCase(words[i].charAt(words[i].length())) == Character.toLowerCase(words[j].charAt(0))) {
                    String temp = words[i + 1];
                    words[i + 1] = words[j];
                    words[j] = temp;
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.append(s + " ");

        }
        return sb;
    }

}
