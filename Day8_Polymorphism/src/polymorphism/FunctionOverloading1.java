package polymorphism;


public class FunctionOverloading1 {

		void assign(int a, int b)
		{
			
			System.out.println("Ara of a square: "+(a*a));
		}
		
		void assign(float a, float b)
		{
			
			System.out.println("Ara of a rectangle: "+(a*b));
		}
		public static void main(String[] args) {
			FunctionOverloading o = new FunctionOverloading();
			o.assign(6);
			o.assign(11,12);

		}

	}



