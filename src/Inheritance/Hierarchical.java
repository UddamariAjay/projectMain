package Inheritance;

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Demo2 d1 = new Demo2();
      d1.inof();
      Demo3 d2 = new Demo3();
      d2.inofs();
		
	}

}
class Demo1{
	public int x= 10;
}
class Demo2 extends Demo1{
	public int y=20;
	public void inof() {
		System.out.println(x);
		System.out.println(y);
	}
}
class Demo3 extends Demo1{
	public int z = 30;
	public void inofs() {
		System.out.println(x);
		System.out.println(z);
	}
}
