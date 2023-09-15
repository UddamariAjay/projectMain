package packageajay;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num = 3;
       switch(num) {
       case 1: System.out.println("sunday");
       break;
       case 2: System.out.println("monday");
       break;
       case 3: System.out.println("tuesday");
       break;
       case 4: System.out.println("wednesday");
       break;
       default: System.out.println("holyday");
       break;
       }
       
       
       
       int n = 55;
       if(n>=90) {
    	   System.out.println("O grade");
       }
       else if(n>70){
    	   System.out.println("A grade");
       }
       else if(n>50) {
    	   System.out.println("B grade");
       }
       else if(n>30) {
    	   System.out.println("C grade");
       }
       else
       {
    	   System.out.println("fail");
       }
	}

}
