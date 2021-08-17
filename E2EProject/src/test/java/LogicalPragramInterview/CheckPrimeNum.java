package LogicalPragramInterview;
import java.util.Scanner;

public class CheckPrimeNum {

	public static void main(String[] args) {
	
		//11%i=0// Prime Number		
		Scanner sc = new Scanner(System.in); //Input Number at run time
		System.out.println("Enter Any Number:- ");
		int a = sc.nextInt();
		boolean flag = false;
		
		for(int i=2;i<a/2;i++)
		{
			if (a%i==0){
				flag = true;
				break;				
			}
		}
		if (flag)
			System.out.println("Entered Number "+ a +" is not a Prime Number");	
		else
			System.out.println("Entered Number "+ a +" is a Prime Number");

	}

}
