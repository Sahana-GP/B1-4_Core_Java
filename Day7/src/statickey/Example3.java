package statickey;

public class Example3 {
	static String str;
	static int a;
	static
	{
		str="Sahana";
		a=30;
	}

	public static void main(String[] args) {
		System.out.println(str);
		System.out.println(a);

	}

}