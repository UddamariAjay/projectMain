package ArrayPack;

public class PatternWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=1;
		int column=1;
		int x;
		do{
			
		x=4;
		do{
			
		System.out.print("");
		x--;
		}while(x>=row);
		column=1;
		do{
			
		System.out.print("*"+" ");
		column++;

		}while(column<=row);
		
		System.out.println(" ");
		
		row++;
		}while (row<=5);
		
	}

}
