package com.javarush.task.task26.task2601;

import java.util.*;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        Arrays.sort(array);
        int len = array.length;
        int mediana = len % 2 != 0 ? array[len / 2] : (int)((array[len / 2] + array[len / 2 - 1]) / 2);
        //implement logic here
        Comparator<Integer> comp = Comparator.comparingInt(o -> Math.abs(o - mediana));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list, comp);
        Integer[] rezult = list.toArray(new Integer[list.size()]);
        return rezult;
    }
}
