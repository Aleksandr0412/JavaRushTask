package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    class StringObject<String> implements SimpleObject<String> {

        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

}
