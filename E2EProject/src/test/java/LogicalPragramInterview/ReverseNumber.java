package LogicalPragramInterview;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		//543
		//543%10=3
		//543/10=54 and so on
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter some integer number: ");
		int val = sc.nextInt();
			
		int res = 0;
		while(val!=0)
		{
			int reminder = val % 10;// 3
			res = reminder + res * 10; // 3
			val = val / 10;// 54
			
		}
		System.out.println(res);
	
	}

}
