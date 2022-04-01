package day3;

public class Constructor {

	String str;
	int a;
	Constructor(String st,int x)
	{
		str=st;
		a=x;
	}
	void display()
	{
		System.out.println(str+" "+a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor("Sahana",50);
		Constructor c1=new Constructor("Pooja",25);
		c.display();
		c1.display();
	}

}
