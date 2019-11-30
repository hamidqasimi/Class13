package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {

		
	// Declare 2D Arrays 
		
		int [] [] array=new int [3][4];
		// create 2D array of String with 2 and 3 columns
		
String[][] arr =new String[2][3];
        
        arr [0][0]="Dogs";
        arr [0][1]="Cats";
        arr [0][2]="Mouse";
        
        arr [1][0]="Pigs";
        arr [1][1]="Cows";
        arr [1][2]="Zebras";
        System.out.println(arr[1][1]);
        
        
        System.out.println("-------");
        
        int [][]numbers= {
        		{8,7,5,3,8},
        		{1,5,6,4,9,8,9},
        		{3,6,8,0,76}
        };
		System.out.println(numbers[1][4]);
		System.out.println(numbers.length);// to identify numbers rows 
		//to identify numbers od columns
		
		System.out.println(numbers[2].length);
		
		for (int i=0; i<numbers.length;i+=2) {
			for (int j=0;j<numbers[i].length;j+=2) 
				System.out.print(numbers[i][j]+" ");
				
			}
			
			System.out.println();
			
			
			
			
		}
		
		
		
		
		
		
	}
		
	

