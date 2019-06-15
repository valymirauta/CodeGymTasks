package com.codegym.task.task13.task1316;

/* 
Incorrect lines

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        String onPress(Object o);
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        public String onPress(Object o);

    }
}