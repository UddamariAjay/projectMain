package Inheritance;

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		c.displays();
	}

}
class Demo{
	public int a=10;
}
class Sample extends Demo{
	public int b = 20;
}
class C extends Sample{
	public int c = 30;
	public void displays() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
