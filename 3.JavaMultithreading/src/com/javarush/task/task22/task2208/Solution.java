package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put(null, "asdfg");
        map.put("qwerty1", null);
        System.out.println(getQuery(map));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        if (params == null || params.isEmpty()) {
            return sb.toString();
        }

        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null)
                continue;
            sb.append(entry.getKey()).append(" = '").append(entry.getValue()).append("' and ");
        }
        if (sb.length() > 5)
            return sb.toString().substring(0, sb.length() - 5);
        else
            return sb.toString();
    }
}
