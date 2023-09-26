package packageajay;

public class ArmStrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1634;
		int count = 0;
	     int pow = 1;
		int sum= 0;
		int temp = n;
		int res= n;
		while(n!=0) {
			
			count++;
			n=n/10;
		}
		
		while(temp!=0) {
			 pow = 1;
			int rem = temp%10;
			
			for(int i=1; i<=count; i++) {
				
				pow = pow*rem;
			}
			
			sum = sum+pow;
			temp = temp/10;
		}
		
		if(sum == res) {
			
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}
	}

}
