package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        // write your code here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);
        try {
            String fileName = bfr.readLine();
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(writer);
            do {
                String lineFile = bfr.readLine();
                bw.write(lineFile + "\n");
                if (lineFile.equals("exit")) {
                    bw.close();
                    break;
                }
            } while (true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        bfr.close();


    }
}
