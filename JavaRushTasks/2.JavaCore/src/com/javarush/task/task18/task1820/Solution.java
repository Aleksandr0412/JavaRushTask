package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());
        reader.close();
        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);

        if (in.available() > 0){
            byte[] data = new byte[in.available()];
            in.read(data);

            String[] strArrDouble = new String(data).split(" ");
            StringBuilder resultStrLong = new StringBuilder(data.length);

            for (String strDouble : strArrDouble) {
                resultStrLong.append(Math.round(Double.valueOf(strDouble)));
                resultStrLong.append(" ");
            }
            out.write(resultStrLong.toString().getBytes());
        }
        in.close();
        out.close();
    }
}
