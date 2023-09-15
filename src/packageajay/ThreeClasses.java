package packageajay;

public class ThreeClasses {
   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class one
		System.out.println("class one");
		System.out.println(one.a);  //call static variable
		one o1 = new one();
		System.out.println(o1.d); //call non static variable
		one.displayOne();    //call static method
		o1.showOne();       // call non static method
		//class two
		System.out.println("class two");
		System.out.println(Two.ch);	
		Two t2 = new Two();
		System.out.println(t2.st);
		Two.displayTwo();
		t2.showTwo();
		
		//class three
		System.out.println("class three");
		System.out.println(Three.b);	
		Three t3 = new Three();
		System.out.println(t3.bo);
		Three.displayThree();
		t3.showThree();
		

	}
}
	class one{
		static int a = 10; //static variable
		double d = 1.9;    //non static variable
		public static void displayOne() {   //static method
			int x=20; //local variable
			System.out.println("local variable  " + x);
			System.out.println("one class static");
		}
		public void showOne() {       //non static method
			System.out.println("one class non ststic");
		}
		
	}
	class Two{
		static char ch = 'a';
		String st = "ajay";
		public static void displayTwo() {
			int y = 30;
			System.out.println("local variable  " + y);
			System.out.println("two class static");
		}
		public void showTwo() {
			System.out.println("two class non ststic");
		}
		
		
	}
	class Three{
		static int b = 20;
		boolean bo = true;
		public static void displayThree() {
			int z = 40;
			System.out.println("local variable  " + z);
			System.out.println("three class static");
		}
		public void showThree() {
			System.out.println("three class non ststic");
		}
			
	}



