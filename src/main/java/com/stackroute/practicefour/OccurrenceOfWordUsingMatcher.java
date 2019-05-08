package com.stackroute.practicefour;

//6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
//        methods

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceOfWordUsingMatcher {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String string=scanner.nextLine();                                            //Reading input as String
        System.out.println("Enter the pattern to be searched");
        String searchElement=scanner.nextLine();

        Pattern pattern=Pattern.compile(searchElement);                               //entering the word to be searched in pattern
        Matcher m=pattern.matcher(string);                                            //cheking if the pattern matches the string

        while (m.find()) {
            System.out.println("found at" + m.start() + "-" + m.end());               //printing the starting position and ending position when the pattern is found
        }
    }
}
