package Inheritance;

public class CompileTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		a.add(10, 20);
		a.add(1.5, 2.5);
		a.add(23, 40);

	}

}
class Addition{
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(double i,double j) {
		System.out.println(i+j);
	}
	public void add(int i,double j) {
		System.out.println(i+j);
	}
}