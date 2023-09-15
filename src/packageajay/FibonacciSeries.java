package packageajay;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		System.out.println(n1 + " " + n2);
		for(int i=1; i<=10; i++) {
			n3=n2+n1;            //0+1=1   	    1+1=2    2+1=3    3+2=5  5+3=8
			n1=n2;				//0=1;n1=1      n1=1     n1=2      n1=3   n1=5
			n2=n3;				//1=1;n2=1      n2=2     n2=3      n2=5   n2=8
			System.out.println(n3);
		}
		

	}

}
