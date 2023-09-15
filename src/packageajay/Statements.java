package packageajay;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		if(n>=10) {
			System.out.println("true");
		}
		
		int num1 = 100;
		if(num1>=100) {
			System.out.println("right");
			
			if(num1>=50) {
				System.out.println("it too right");
			}
		}

		int age= 18;
		if(age>=18) {
			System.out.println("age above 18 eligible for lances");
		}
		else
		{
			System.out.println("age below 18 not eligible for lances");
		}
		
		
		
		int num =100;
		if(num>=100) {
			System.out.println("num greater than 100 or equal 100");
		}
		
		int maths=60;
		int science=50;
		int english=40;
		int french = 35;
		if(maths>=60 && science>=50 && english>=40 || french<35) {
			System.out.println("students are promated");
		}
		else
		{
			System.out.println("students are not promated");
		}
		
		
	}

}
