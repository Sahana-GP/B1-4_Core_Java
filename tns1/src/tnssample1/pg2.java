package tnssample1;

import java.util.Scanner;

public class pg2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print((i*5)+1 +", ");
		}
		s.close();
	}

}
