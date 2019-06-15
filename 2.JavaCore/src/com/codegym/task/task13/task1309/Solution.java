package com.codegym.task.task13.task1309;

/* 
All that moves

*/

public class Solution {
    interface CanMove{
        Double speed();

    }
    interface  CanFly extends CanMove {
        Double speed(CanFly canFly);
    }

    public static void main(String[] args) {
    }
}