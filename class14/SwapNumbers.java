package com.class14;

public class SwapNumbers {

	public static void main(String[] args) {

int first=20;  int second=30;
		
		System.out.println("Before Swap");
		System.out.println("First number = "+ first);
		System.out.println("Second number "+second);
		
		first=first-second;    // a=a+b;		
		second=first+second;    //b=a-b;
		first=second-first;     //a=a-b;
		
		System.out.println("after swap");
		
		
		System.out.println("First number = "+ first);
		System.out.println("Second number "+second);
		
		
		System.out.println("=========================Swapping 2 Strings ");
		
		String x="Love";
		String y="You";
		
		System.out.println("Before Swap "+x+" "+ y);
		
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		

		System.out.println("------------- instructor way");
		
		 int a=10; 
		 int b=20;

		 a=a+b;//30
		 b=a-b;//30-20=10
		 a=a-b;//30-10=20
		 System.out.println("The value of a="+a);
		 System.out.println("The value of b="+b);
		 
		 String str1="Hello";
		 String str2="Welcome";//7
		 
		 str1=str1+str2;//HelloWelcome--> 12
		 str2=str1.substring(0, str1.length()-str2.length());//Hello
		 str1=str1.substring(str2.length());
		 
		 System.out.println("The value of str1="+str1);
		 System.out.println("The value of str2="+str2);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
