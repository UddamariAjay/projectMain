package ArrayPack;

public class Pattern5to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 6;       
		
		for (int i=0; i<row; i++)   
		{  
		      
		for (int j=2*(row-i); j>=0; j--)         
		{  
	      
		System.out.print(" ");   
		}   
	 
		for (int j=0; j<=i; j++ )   
		{   
	     
		System.out.print("* ");   
		}   
		System.out.println();  
		}
	}

}
