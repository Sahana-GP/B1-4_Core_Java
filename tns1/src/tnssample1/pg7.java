package tnssample1;
import java.util.Scanner;
public class pg7 {

	
	
	
	  public static void main(String[] args)
	  {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = 0, b = 0;
	    if(n % 2 == 0)
	    {
	      for(int i = 1 ; i <= (n-2) ; i = i+2)
	      {
	        a = a + 2;
	        b = a / 2;
	      }
	      System.out.print(b);
	     }
	     else
	     {
	       for(int i = 1 ; i < (n-2) ; i = i+2)
	       {
	         a = a + 2;
	         b = a / 2;
	       }
	       a = a + 2;
	       System.out.print(a);
	     }
	    sc.close();
	   }
	}