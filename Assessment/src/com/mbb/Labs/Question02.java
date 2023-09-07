package com.mbb.Labs;
import java.util.*;

public class Question02 {

	    public static boolean isValidArr(int[] arr) {
	        Set<Integer> uniqueElements = new HashSet<>();
	        
	        for (int num : arr) {
	            if (uniqueElements.contains(num)) {
	                return false; 
	            }
	            uniqueElements.add(num);
	        }
	        
	        return true; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
	        
	        if (isValidArr(arr)) {
	            System.out.println("The array is valid.");
	        } else {
	            System.out.println("The array is not valid.");
	        }
	    }
	}
