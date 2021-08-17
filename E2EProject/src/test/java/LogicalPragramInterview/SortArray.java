package LogicalPragramInterview;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,5,4,5,4,2};
		int temp;
		
		for (int i=0; i<a.length; i++)
		{
 			for(int j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j])//5>2 
				{
					//swap number using variable
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				
				}
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		
		/* 
		 ### Important ###
		 -if someone want to swap number without using variable then
		  below puzzled logic can be used.
		*/
		
		  int x= 3;
		  int y= 5;
		  x=x+y;//x=8
		  y=x-y;//y=3
		  x=x-y;//x=5
		 		
		
				

	}

}
