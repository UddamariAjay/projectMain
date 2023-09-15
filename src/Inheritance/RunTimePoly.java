package Inheritance;

public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion l = new Lion();
		l.noise();
		Tiger t = new Tiger();
		t.noise();
	}

}
class Animal{
	public void noise() {
		System.out.println("animal");
	}
}
class Lion extends Animal{
	public void noise() {
		System.out.println("lion");
	}
}
class Tiger extends Animal{
	public void noise() {
		System.out.println("Tiger");
	}
}


