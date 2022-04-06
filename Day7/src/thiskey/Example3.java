package thiskey;

public class Example3 {
	void print(Example3 e)
	{
		System.out.println("JAVA");
	}
	void display()
	{
		print(this);
	}

	public static void main(String[] args) {
		Example3 e=new Example3();
		e.display();

	}

}