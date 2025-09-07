
package arrayProgramming;

public class BiggestAndSecondBiggest 
{
	public static void main(String[] args) 
	{ 
		int[]arr = {2,3,9,12,34,55,4,23,6,85};
		
		int biggest = Integer.MIN_VALUE;
		int second_biggest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>biggest)
			{
				second_biggest = biggest;
				biggest = arr[i];
			}
			else if(arr[i]>second_biggest && arr[i]!=biggest)
			{
				second_biggest = arr[i];
			}
		}
		System.out.println("Biggest:"+biggest);
		System.out.println("Second Biggest"+second_biggest);
	}
}
