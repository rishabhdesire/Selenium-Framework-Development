package LogicalPragramInterview;

public class CountCharInString {

	public static void main(String[] args) {
		String str = "My name is Rishabh Verma";
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			char ch = str.charAt(i);
			for(int j=i+1;j<str.length()-1;j++)
			{
				char ch2 = str.charAt(j);
				if(ch==ch2)
				{
					count++;
				}
			}
			System.out.println(ch+" is having count: "+count);
			
		}
		

	}

}
