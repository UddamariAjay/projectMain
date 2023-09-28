package methOverriding;

public class dog extends animal {

	dog(){
		
		super();
		//System.out.println("dog const");
	}
	public String name= "dog var";
	
	
	public void sleep() {
		
	
		System.out.println("dog sleeps");
	}
	
	public void eat() {
		
	    this.sleep();
		super.eat();
		System.out.println(super.name);
		//System.out.println("dog eats");
	}
	
	 public void eat(String foodName, String val) {
			
			System.out.println("dog eats double");
		}
}
