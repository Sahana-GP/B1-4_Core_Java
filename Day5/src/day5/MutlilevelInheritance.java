package day5;

class R6{
	void print() {
		System.out.println("I Like R6");
	}
}

class R3 extends R6{
	
	void display() {
		System.out.println("I Like R3");
	}
}

class R15 extends R3{
	void assign() {
		System.out.println("I Like R15");
	}
}
public class MutlilevelInheritance {

	public static void main(String[] args) {
		R15 r =new R15();
		r.display();
		r.assign();
		r.print();
	}

}
