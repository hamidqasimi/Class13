package com.class11;

import java.util.Arrays;

public class ClassTask {

	public static void main(String[] args) {


		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
			
	     //should print 10
		
	    
			int row = 0;
			int total = 0;
			for (int j = 0; j < a[row].length; j++) {
				total = total + a[row][j];
			}
			System.out.println( total);
		
	}}	