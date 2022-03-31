package tnssample1;
import java.util.Scanner;
import java.lang.Math;

public class pg6 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//6
		//1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187
		if(n%2==1)
		{
			int a=1;
			int term=(n+1)/2;//2
			double x=Math.pow(2,term-1);
			double res=a*x;
			System.out.println(res);
		}
		else
		{
			int a=1;
			int term=(n+1)/2;//3
			double x=Math.pow(3,term-1);
			double res=a*x;//2
			System.out.println(res);
		}
		s.close();
		


	}}