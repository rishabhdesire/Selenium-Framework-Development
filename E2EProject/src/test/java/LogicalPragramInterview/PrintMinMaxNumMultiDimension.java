package LogicalPragramInterview;

public class PrintMinMaxNumMultiDimension {

	public static void main(String[] args) {
		/*2 3 5
		 *6 2 7
		 *5 1 8
		 * * */
		int abc[][] = {{2,3,5},{6,2,7},{5,1,8}};
		int min = abc[0][0];
		int max = abc[0][0];
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
					min=abc[i][j];
				else if(abc[i][j]>max)
					max=abc[i][j];
			}
		}
		System.out.println("Min num is: "+ min);
		System.out.println("Max num is: "+ max);		
	}

}
