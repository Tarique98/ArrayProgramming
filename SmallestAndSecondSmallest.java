package arrayProgramming;

public class SmallestAndSecondSmallest 
{
	public static void main(String[] args) 
	{
		int[]arr = {2,12,3,45,6,45,7};
		
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				smallest = arr[i];
				arr[i] = second_smallest;
			}
			else if(arr[i]<second_smallest && arr[i]!=smallest)
			{
				second_smallest = arr[i];
			}
		}
		System.out.println("smallest:"+smallest);
		System.out.println("Second smallest:"+second_smallest);
	}
}
