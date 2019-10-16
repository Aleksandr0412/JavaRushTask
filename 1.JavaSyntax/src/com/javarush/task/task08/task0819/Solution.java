package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> it = cats.iterator();
        if (it.hasNext())
            cats.remove(it.next());

        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catsSet = new HashSet<>();
        catsSet.add(new Cat());
        catsSet.add(new Cat());
        catsSet.add(new Cat());
        //напишите тут ваш код. step 2 - пункт 2
        return catsSet;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
        // step 4 - пункт 4
    }

    private static class Cat {
        public Cat() {
        }
    }

    // step 1 - пункт 1
}
