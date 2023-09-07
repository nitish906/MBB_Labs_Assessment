package com.mbb.Labs;
import java.util.*;

public class Question03 {
	public static void main(String[] args) {
	        int[] numbers = {56, 67, 24, 3, 88, 17, 55};

	        Arrays.sort(numbers);

	        System.out.println("Sorted Array: " + Arrays.toString(numbers));
	    }
	}

	class CustomComparator implements Comparator<Integer> {
	    @Override
	    public int compare(Integer a, Integer b) {
	        if (a % 2 != 0 && b % 2 != 0) {
	            return a - b;
	        } else if (a % 2 == 0 && b % 2 == 0) {
	            return a - b;
	        } else {
	            return a % 2 != 0 ? -1 : 1;
	        }
	    }
	}
