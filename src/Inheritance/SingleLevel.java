package Inheritance;

public class SingleLevel {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.display();

	}

}

class A {
	public int i = 10;
}

class B extends A {
   public int j = 20;
   public void display() {
	   System.out.println(i);
	   System.out.println(j);
   }
}
