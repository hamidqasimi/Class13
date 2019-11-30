package com.class11;

public class LoopDemo {

	public static void main(String[] args) {

		
		 int[][] num = {
	                { 8, 7, 5, 4 },
	                { 1, 5, 6, 17 },
	                { 3, 6, 8, 10 }
	                };
		int sum=0;

		 for(int a=0;a<num.length;a++) {
			 for(int b=0;b<num[a].length;b++) {
			 System.out.println(num[a][b]);
			 sum=sum+num[a][b];
			 }
           System.out.println();
		 
		 
		 }
		 
		 System.out.println(sum);
		 
		 
		 
		 
		 
		 
	}}