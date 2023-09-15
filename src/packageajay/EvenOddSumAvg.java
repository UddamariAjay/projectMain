package packageajay;
import java.util.Scanner;
public class EvenOddSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      
	        int evenSum = 0;
	        int evenAvg =0;
	        int evenCount = 0;
	        int oddSum = 0;
	        int oddAvg =0;
	        int oddCount = 0;
	        Scanner sc =new Scanner(System.in);
	        System.out.println("enter the size of array: ");
	        int size = sc.nextInt();
	        
	        int arr[]=new int[size];
	        System.out.println("enter the values of an array");
	               
	        for(int i=0; i<size; i++) {
	        	arr[i]= sc.nextInt();
	        }
	        for(int i=0; i<size; i++) {
	        	if(arr[i]%2==0) {
	        		evenCount++;
	        		evenSum=evenSum+arr[i];
	        		evenAvg=evenSum/evenCount;
	        	}
	        	else {
	        		oddCount++;
	        		oddSum=oddSum+arr[i];
	        		oddAvg=oddSum/oddCount;
	        	}
	        }
	        
	       
	        System.out.println("sum of Even Numbers:" + evenSum);
	        System.out.println("sum of even number count: " + evenCount);
	        System.out.println("average of even numbers: " + evenAvg);
	       
	        System.out.println("-----------------------------------");
	        
	        System.out.println("Sum of odd numbers: " + oddSum);
	        System.out.println("sum of odd number count: " + oddCount);
	        System.out.println("Average of odd numbers: " + oddAvg);
	}

}
