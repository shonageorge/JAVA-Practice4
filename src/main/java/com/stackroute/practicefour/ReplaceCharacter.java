package com.stackroute.practicefour;

//2. Write a program to replace all d with f and all l with t in the given String

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the orginal string : ");
        String originalString = scanner.nextLine();                               //Reading string
        String newString = originalString.replaceAll("d", "f").replace("l", "t"); //replacing "d" and "f" in string with "l" and "t"
        System.out.println("New string after replacement : " + newString);
    }
}
