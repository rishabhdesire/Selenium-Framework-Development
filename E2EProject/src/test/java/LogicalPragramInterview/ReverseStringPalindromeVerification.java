package LogicalPragramInterview;

import java.util.Scanner;

public class ReverseStringPalindromeVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Any Word: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String newstr = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			newstr = newstr + str.charAt(i);
		}
		if(newstr.equals(str))
			System.out.println(str +" is a palindrome");
		else
			System.out.println(str +" is not a palindrome");

	}

}