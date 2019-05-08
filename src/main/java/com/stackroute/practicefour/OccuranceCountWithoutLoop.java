package com.stackroute.practicefour;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//1. Write a java program to count the total number of occurrences of a given character in a string
//        without using any loop?

public class OccuranceCountWithoutLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = scanner.nextLine();
        System.out.print("Enter the character to check the occurance : ");
        char charocc = scanner.next().charAt(0);                                             //reading the input as character

        char[] characterArray = string.toCharArray();                                   //converting string to char array

        Map<Character, Integer> hashmap = new HashMap<>();


        for (char e : characterArray) {

            if (hashmap.containsKey(e))                                              //checking the occurance of chatacter in hashmap
                hashmap.put(e, hashmap.get(e) + 1);
            else
                hashmap.put(e, 1);


        }
        System.out.println("occurance of " + charocc + " is : " + hashmap.get(charocc));

    }
}
