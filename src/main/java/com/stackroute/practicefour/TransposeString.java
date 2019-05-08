package com.stackroute.practicefour;

//4. Write a program to transpose the given string.

import java.util.*;

public class TransposeString {
    public static void main(String[] args) {

        TransposeString transposeString = new TransposeString();
        transposeString.sendString();


    }

    public void sendString() {
        int i;
        String originalString = " a quick brown fox jumps over the lazy dog";
        System.out.println("Original String : " + originalString);
        List<String> transpose = new ArrayList<>();                                             //declaring arraylist

        transpose = Arrays.asList(originalString.split(" "));                            //splitting the string with space and storing it in list
        System.out.print("New String : ");
        for (i = 0; i < transpose.size(); i++) {

            System.out.print(reverseString(transpose.get(i)) + " ");                             //method call
        }

    }

    public String reverseString(String s)                                                      //reverse string
    {
        int length = s.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;                                                                          //return reversed string

    }
}
