package polymorphism;

import java.util.Scanner;
class MagicNumber
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int n=num;
        
        int sum = 0; 
        while(n>0 || sum>9)
        { 
            if (n==0)
            {
                n = sum; 
                sum = 0;
            } 
            sum += n%10; 
            n /= 10;
        }
        in.close();
        if(sum==1)
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + " is not a Magic Number");
    }
}