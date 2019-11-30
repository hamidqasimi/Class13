package com.class14;

public class Palindorm {

	public static void main(String[] args) {

		String str="Java to Java Class ";
		
		String[]word=str.split(" ");
		
		for (int a=0;a<word.length;a++) {
			
			for (int b=word[a].length()-1;b>=0;b--) {
				System.out.print(word[a].charAt(b));
			}
			System.out.print(" ");
		}
		
		}
		
		
		
	}

