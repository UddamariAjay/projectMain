package packageajay;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ldigit l = new Ldigit();
		l.digit();
	

	}

}
class Ldigit{
	
	public void digit() {
		
		int n = 12345;
		while(n!=0) {
			n=n%10;
			System.out.println(n);
		   break;
		}
	}
}