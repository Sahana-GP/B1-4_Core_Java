package tnssample1;

public class Factorial {
	 public static void main(String args[]){  
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}

/*
package com.tns.example;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		s.close();
	}

}
   
   
   
package com.tns.example;

import java.util.Scanner;

public class Program5 {
	//function definition
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//5
		System.out.println(factorial(n));//function call
		s.close();
		

	}

}*/