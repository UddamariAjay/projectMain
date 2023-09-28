package methOverriding;

public class animal {

	animal(){
		
		System.out.println("animal const");
	}
    public String name = "animal var";
	
	public void sleep() {
		
		System.out.println("animal sleeps");
	}
	
	public void eat() {

		System.out.println("animal eats");
	}
	
	public  void eat(String foodName) {
		
		System.out.println("animal eats static");
	}
	
   public void eat(String foodName, String val) {
		
		System.out.println("animal eats double");
	}

}
