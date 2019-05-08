package com.stackroute.practicefour;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Write a program with the implementation of Regular Expression to find the presence of the name
//        Harry in a string.
public class RegularExpressionForNameSearch {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        String sentance = scanner.nextLine();                                   //reading string

        Pattern pattern = Pattern.compile("Harry");                            //pattern is set as Harry
        Matcher m = pattern.matcher(sentance);
        if (m.find())                                                        //if pattern present in the string return true
            flag = true;

        System.out.println("Is Harry here?" + flag);

    }
}