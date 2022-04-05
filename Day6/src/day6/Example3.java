package day6;

class A
{
	String name="Bob";
}
class B extends A
{
	String name="Alice";
	void print()
	{
		System.out.println("Hi, I am "+name);
		System.out.println("Hi, I am "+super.name);
	}
}
public class Example3 
{

	public static void main(String[] args) 
	{
		B b=new B();
		b.print();

	}

}