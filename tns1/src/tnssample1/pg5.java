package tnssample1;

import java.util.Scanner;

public class pg5 {

	public static void main(String[] args) {
		
		   int i = 11 , count; 
		   System.out.print("enter the number of elements in the series: "); 
		   Scanner s=new Scanner(System.in);
		   int n=s.nextInt();
		   for(count = 0;count<n;count++) 
		   { 
		System.out.print(i*i +" "); 
		   i=i+4; 
		   } 
		    
		 


	}

}
