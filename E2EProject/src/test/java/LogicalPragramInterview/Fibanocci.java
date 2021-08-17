package LogicalPragramInterview;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibanocci Logic
		//0 1...1 2 3 5 8 13 21 34...
		//a b...s
		//a+b = s
		//  a + b=s
		//  s + b=s //
		//So,   a=b; and b=s;
			
		int a= 0;
		int b= 1;
		int sum=0;
		
		int i=1;
		while(i<9)
		{
			i++;
			sum = a+b;
			System.out.print(sum); //1,
			System.out.print("\t");
			a=b;
			b=sum;

		}
		
		
	}

}

