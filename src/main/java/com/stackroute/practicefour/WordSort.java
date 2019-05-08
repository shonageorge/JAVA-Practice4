package com.stackroute.practicefour;

//3. Write a program that sets up a String variable containing a paragraph of text of your choice.
//        a. Extract the words from the text and sort them into alphabetical order.
//        b. Display the sorted list of words.

import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        int i;

        String paragraph ="In the software development process, a reference implementation . An improvement to a reference implementation reflects an unchanging specification. ";
        System.out.println("Paragraph before sorting is : "+paragraph);
        String[] stringArray=paragraph.split(" ");                           //splitting the string with space and storing in string array
        List<String> word=new ArrayList<>();

        for (i=0;i<stringArray.length;i++){
           word.add(stringArray[i]);                                               //adding string array to list
           Collections.sort(word);                                                 //function to sort collection
        }
        System.out.println(word);

    }
}
