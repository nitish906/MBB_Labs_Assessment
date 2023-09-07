package com.mbb.Labs;

import java.util.Scanner;

public class Question04 {
	
	    public static String findOtherName(String name) {

	        StringBuilder otherName = new StringBuilder();
	        
	        for (char ch : name.toCharArray()) {
	            if (Character.isLowerCase(ch)) {
	                otherName.append((char) ('z' - (ch - 'a')));
	            } else if (Character.isUpperCase(ch)) {
	                otherName.append((char) ('Z' - (ch - 'A')));
	            } else {
	                otherName.append(ch);
	            }
	        }
	        
	        return otherName.toString();
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String yourName = sc.nextLine();

	        String otherName = findOtherName(yourName);
	        System.out.println("Your other name is: " + otherName);

	    }
	}
