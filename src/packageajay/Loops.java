package packageajay;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		for(int i=1; i<=50; i++) {
			
			if(i%2==0){
				System.out.println(i);
			}
		}
		
		//while loop
		int n = 1;
		while(n<=50) {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}
		
		//do while loop
		int a = 1;
      do {
    	  System.out.println(a);
    	  a++;
    	 
      }while(a<=10);
	}

}
