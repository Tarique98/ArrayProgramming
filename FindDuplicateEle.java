package arrayProgramming;

public class FindDuplicateEle 
{
	public static void main(String[] args) 
	{
		int [] arr = {12,22,12,30,12,40,30,30,22};
		System.out.println("Duplicate Element in array");
		
		for(int i=0;i<arr.length;i++)
		{	
		    boolean alreadyPrinted = false;
			
			for(int k=0;k<i; k++)
			{
				if(arr[i] == arr[k])
				{
					alreadyPrinted = true;
					break;
				}
			}
			if(alreadyPrinted)
			{
				continue;
			}
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
	}
}
