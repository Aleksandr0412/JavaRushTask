package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> fioMap = new HashMap<>();
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());
        fioMap.put("qwe" + Math.random(), "asd" + Math.random());

        return fioMap;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int k = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) k++;
        }
        return k;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int k = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) k++;
        }
        return k;

    }

    public static void main(String[] args) {

    }
}
