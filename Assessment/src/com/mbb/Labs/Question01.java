package com.mbb.Labs;

import java.util.*;

/*
 * Question 01:-
 An word in incorrect if any of the following is true.

	a.  It contains characters other than alphabets and numbers
	
	b. If two consecutive characters are same

Write a program to find if a word is correct or incorrect
 */

public class Question01 {
    public static boolean isCorrectWord(String word) {
    	
        if (!word.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }
    
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input word from the user
        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
     // Check if the word is correct or incorrect and display the result
        if (isCorrectWord(word)) {
            System.out.println(word + "' is a correct word.");
        } else {
            System.out.println(word + "' is an incorrect word.");
        }

     
    }
}

