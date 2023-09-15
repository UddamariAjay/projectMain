package packageajay;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const c1 = new Const();
		Const c2 = new Const(10, 20);
		c1.hyd();
		c1.add(50, 60);
		
		

	}

}

class Const{
	Const(){     //without arg
		System.out.println("hyd");
	}
	
	
	Const(int a,int b){     //with arg 
		int c= a+b;
		System.out.println(c);
	}
	
	
	
	public void hyd() {
		System.out.println("welcome to hyd");
	}
	
	public void add(int d, int e) {
		int f=d+e;
		System.out.println(f);
		
	}
}
