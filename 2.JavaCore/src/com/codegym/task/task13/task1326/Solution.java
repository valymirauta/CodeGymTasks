package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            String fileName = br.readLine();
            FileInputStream input = new FileInputStream(fileName);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            ArrayList<Integer> list = new ArrayList<>();
            String data = null;

            while ((data = reader.readLine()) != null) {
                list.add(Integer.parseInt(data));
            }
            Collections.sort(list);
            for (Integer nr : list) {
                if (nr%2==0)
                System.out.println(nr);
            }
            br.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
