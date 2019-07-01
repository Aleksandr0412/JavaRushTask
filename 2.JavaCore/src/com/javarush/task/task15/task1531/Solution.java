package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        BigInteger integer1 = new BigInteger("1");
        BigInteger integer2 = new BigInteger("1");
        if (n < 0) return Integer.toString(0);
        for (int i = 1; i <= n; i++) {
            integer2 = integer1.multiply(BigInteger.valueOf(i));
            integer1 = new BigInteger(integer2.toString());
        }

        return integer2.toString();
    }
}
