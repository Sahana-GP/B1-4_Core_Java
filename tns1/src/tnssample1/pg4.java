package tnssample1;

import java.util.Scanner;

public class pg4{

	public static void main(String[] args)
	{
		//0.5,1.5,4.5,13.5,...
		double a=0.5;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(a+" ");
		
		for(int i=2;i<=n;i++)
		{
			 a=a*3;
			System.out.print(a+" ");
		}
		s.close();

	}

}