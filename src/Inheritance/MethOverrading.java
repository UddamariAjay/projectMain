package Inheritance;

public class MethOverrading {
 	
	public static void main(String[] args) {
		// TODO Auto-generated method 
            move m = new move();
            m.view();

	}

}
class meth{
	public void view() {
	    System.out.println("view right");   
	}
}
class move extends meth{
	public void view() {
		System.out.println("view lift");   
	}
}
