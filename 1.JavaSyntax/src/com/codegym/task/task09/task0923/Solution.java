package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        String textVowels = "";
        String textConsonants = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sir = br.readLine();
        for (int i = 0; i < sir.length(); i++) {
            if (isVowel(sir.charAt(i)))
                textVowels += sir.charAt(i) + " ";
            else if (!(sir.charAt(i) ==32))
                textConsonants += sir.charAt(i) + " ";
        }
        System.out.println(textVowels);
        System.out.println(textConsonants);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}