//single dimesional array

package com.capgemini.corejava;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int a[] = new int[5]; //declaration and instantiation
				
		//initialization
		a[0] = 10; 		
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
				
		for (int i = 0; i < a.length; i++) //length is the property of array
			System.out.println(a[i]);
	



	}

}