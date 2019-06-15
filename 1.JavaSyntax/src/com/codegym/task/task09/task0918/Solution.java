package com.codegym.task.task09.task0918;

/* 
We're all friends here, even the exceptions

*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException  extends Exception{

    }

    static class MyException2  extends RuntimeException{
    }

    static class MyException3  extends MyException{
    }

    static class MyException4  extends MyException2{
    }
}

