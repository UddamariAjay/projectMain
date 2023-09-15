package packageajay;

public class classaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		ajay aj = new ajay();
		aj.hyd();
		aj.scr();
		System.out.println(aj.n);
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		int a=100;
		int rev=0;
		while(a!=0) {
			int rem=a%10;
			rev=rev+rem*10;
			a=a/10;
		}
		
		System.out.println(rev);

	}
}
class ajay{
	int n = 30;
	public void hyd() {
		System.out.println("welcome HYD");
	}
	
	public void scr() {
		System.out.println("welcome scr");
	}
	
	
	
	
}


