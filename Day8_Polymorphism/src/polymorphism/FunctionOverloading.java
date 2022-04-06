package polymorphism;
//by changing number of arguments
public class FunctionOverloading {

	
	void assign(int a)
	{
		
		System.out.println("Ara of a square: "+(a*a));
	}
	
	void assign(int a, int b)
	{
		
		System.out.println("Ara of a rectangle: "+(a*b));
	}
	public static void main(String[] args) {
		FunctionOverloading o = new FunctionOverloading();
		o.assign(5);
		o.assign(11,12);
	}

}
