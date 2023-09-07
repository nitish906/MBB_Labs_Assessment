package com.mbb.Labs;
import java.util.*;

/*
 * Question: 05
	 I have two arrays
	
	intArr = [2,34,1,45,....]
	
	strArr = [a,f,e,v,.....]
	
	Your program should take an input, see if it a string or integer. 
	If it is integer it should return corresponding string. 
	Like if we enter 34 it should return f.
	
	If it is a string like v it should return 45.
 */

public class Question05 {
	
	public static String findCorrespondingString(int intValue, int[] intArr, char[] strArr) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == intValue) {
                return Character.toString(strArr[i]);
            }
        }
        return "Not found";
    }

    public static int findCorrespondingInt(int j, int[] intArr, char[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] == j) {
                return intArr[i];
            }
        }
        return -1; 
    }

	public static void main(String[] args) {
	        int[] intArr = {2, 34, 1, 45}; 
	        char[] strArr = {'a', 'f', 'e', 'v'}; 

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a value (integer or string): ");
	        String intValue = sc.nextLine();
	        
	       // findCorrespondingString(intValue, intArr, strArr);
	       // findCorrespondingInt(intValue, intArr, strArr);
	        
	       
	    }
	    
	}
