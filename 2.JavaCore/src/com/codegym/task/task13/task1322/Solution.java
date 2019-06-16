package com.codegym.task.task13.task1322;

/* 
SimpleObject interface

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<String>();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public  static class StringObject<S> implements SimpleObject{

        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
