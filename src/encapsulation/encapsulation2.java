package encapsulation;

public class encapsulation2 {

	private String name;
	private String role;
	private int bNo;
	
	public void accept(String name, String role, int bNo) {
		 
		this.name=name;
		this.role=role;
		this.bNo=bNo;
	}
	
	public void show() {
		
		System.out.println(name);
		System.out.println(role);
		System.out.println(bNo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		encapsulation2 e = new encapsulation2();
		e.accept("ajay", "tester", 5);
		e.show();
		
	}

}
