package packageajay;

public class RevWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello People";
		String [] a = s.split(" ");
		String s2 = " ";
		
		for(int i=0; i<=a.length-1; i++) {
			
			String rev = "  ";
			
			for(int j=a[i].length()-1; j>=0; j--) {
				
				rev = rev+a[i].charAt(j);
			}
			s2= s2+rev+" ";
            }
		s2= s2.trim();
		System.out.println(s2);

	}

	}
