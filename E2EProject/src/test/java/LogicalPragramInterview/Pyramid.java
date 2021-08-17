package LogicalPragramInterview;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Task
		^
		^ ^
		^ ^ ^
		^ ^ ^ ^		
		*/
		
		for (int i=1;i<=4;i++) //outer loop
		{
			for(int j=1;j<=i;j++) // inner loop 
			{
				System.out.print("^");
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
