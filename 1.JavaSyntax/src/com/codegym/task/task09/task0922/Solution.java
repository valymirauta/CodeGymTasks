package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat yyyyMmDd = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat MmmDdYyyy=new SimpleDateFormat("MMM dd, yyyy");
        String s = br.readLine();
        Date date = yyyyMmDd.parse(s);
        System.out.println(MmmDdYyyy.format(date).toUpperCase());


    }
}
