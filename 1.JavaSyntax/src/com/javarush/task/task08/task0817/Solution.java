package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("qwe", "asd");
        map.put("qwe1", "asd");
        map.put("qwe2", "asd");
        map.put("qwe3", "asd");
        map.put("qwe4", "asd");
        map.put("qwe5", "asd");
        map.put("qwe6", "asd");
        map.put("qwe7", "asd");
        map.put("qwe8", "asd");
        map.put("qwe9", "asd");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
//        Map<String, String> map1 = createMap();
        Set<String> list = new TreeSet<>();
        String temp;
        int i = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            temp = pair.getValue();
            for (Map.Entry<String, String> pair1 : map.entrySet()) {
                if (pair1.getValue().equals(temp)) i++;

            }
            if (i > 1) list.add(temp);
            i = 0;

        }

        for (String s : list) {
            removeItemFromMapByValue(map, s);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
