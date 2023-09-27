package staticPack;

public class static1 {
  
	static int a = 0;
	int b=2;
	String name = "ajay";
	
	static1(){
		
		this.a++;
		System.out.println(a);
		
	}
	
	public void add() {
		
		this.a=this.a+1;
		this.a=b+2;
		System.out.println(a);
	}
	
	public void mul() {
		
		this.a=this.a+1;
		this.a = b*2;
		System.out.println(a);
		
	}
}
