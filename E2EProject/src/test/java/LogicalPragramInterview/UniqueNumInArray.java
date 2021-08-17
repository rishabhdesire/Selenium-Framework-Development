package LogicalPragramInterview;
import java.util.ArrayList;

public class UniqueNumInArray {

	public static void main(String[] args) {
				
		int a[] = {2,3,4,5,5,5,3,2,3,4,9};
		
		ArrayList<Integer> al = new ArrayList<Integer>();//array list
		for (int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))//to check if already exist
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length-1;j++)//check in rest array
				{
					if(a[i]==a[j])//if exit 
					{
						k=k+1;
					}
				}
				System.out.println(a[i]+ " is present with count: "+ k);
				if(k==1)
					System.out.println(a[i]+" is a unique number");
			}			
		}		
	}

	}


