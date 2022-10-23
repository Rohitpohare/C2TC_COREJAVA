package com.capgemini.javademo;

public class forwhiledowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // for loop
		  for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			  j++;
			  System.out.println("i="+i+" and j="+j); 
		  }


		  // while loop 
			  int i=1,j=1;
			  while(i<10 || j<10)
			  { 
				  i++; j++;
			      System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
			int u= 1, k = 1;
			do {
				u++;
				k++;
				System.out.println("u=" + u + " and k=" + k);
			    } while (u < 10 || k < 10);

	}

}
