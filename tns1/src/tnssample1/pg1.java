package tnssample1;

import java.util.Scanner;

public class pg1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i*i +", ");
		}
		s.close();
	}

}
