package com.example;

import java.util.List;
import java.util.stream.Stream;

public class StringReverseDemo {
    public static void main(String[] args) {

        // Reverse a string in Java
        String str1 = "Hello";
        String reverse = new StringBuilder(str1).reverse().toString();
        System.out.println("reverse = " + reverse);


        // Using traditional approach to reverse the string
        char[] charArray = str1.toCharArray();
        String s = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            s = s + charArray[i];
        }
        System.out.println("reversedString = " + s);
    }
}
