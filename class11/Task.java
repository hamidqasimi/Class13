package com.class11;

public class Task {

	public static void main(String[] args) {

		String[] country= {"India","Canda","USA"};
		for (String get:country) {
			if (get.equals("USA")) {
				System.out.println("The capital is DC");
			}
		}
		
		for (int i=0; i<country.length;i++) {
			if (country[i].equals("USA")) {
				System.out.println("the cpitals is humm");
			}
		}
		
		
	}

}