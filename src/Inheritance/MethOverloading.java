package Inheritance;

public class MethOverloading {

	public void view(int a,int b) {
		System.out.println(a+b);
	}
	public void view(String s) {
		System.out.println(s);
	}
	public void view(double d) {
		System.out.println(d);
	}
	public void view(char ch) {
		System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethOverloading m = new MethOverloading();
		m.view(10,20);
		m.view("ajay");
		m.view(1.1);
		m.view('a');
		
	}

}
