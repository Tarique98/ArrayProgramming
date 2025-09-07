// Quest-8 -> WAJP to print the Biggest element, Smallest element and their difference in the array.

package arrayProgramming;

public class B_elelmentAndSmalest_e 
{
	public static void main(String[] args) 
	{
		int[]arr = {2,5,9,13,60};
		int biggest = -1;
		int smallest = 99;
		
		for(int i=0; i<arr.length; i++)
		{
			if(biggest<arr[i])
			{
				biggest = arr[i];
			}
		}
		System.out.println("The Biggest element is:"+ biggest);
		
		for(int i=0; i<arr.length; i++)
		{
			if(smallest>arr[i])
			{
				smallest = arr[i];
			}
		}
		System.out.println("The Smallest element is:"+ smallest );
		
	}
}
