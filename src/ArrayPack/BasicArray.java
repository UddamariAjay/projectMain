package ArrayPack;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		a[1] = 6;
		a[3]= 9;
		System.out.println("length of an array : "+ a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		
		//for loop
		System.out.println("For loop o/p :");
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
       
		
		//for each loop
		System.out.println("For each loop o/p :");
		for(int j : a) {
			
			System.out.println(j);
		}
	}

}
