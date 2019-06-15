package com.codegym.task.task09.task0921;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Integer> arrayList = new ArrayList<>();
        try {
            while (true) {
                int nr = Integer.parseInt(br.readLine());
                arrayList.add(nr);
            }
        } catch (Exception e) {
            for (int i : arrayList) {
                System.out.println(i);
            }

        }
    }
}


