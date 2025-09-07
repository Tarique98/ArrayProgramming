// Quest-7 -> WAJP to print and count all the elements of array which are bigger than average value.
package arrayProgramming;

public class BiggerThanAverage 
{
	public static void main(String[] args) 
	{
		int[]arr = {12,33,45,67};
		int sum = 0;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}	
		int average=sum/arr.length;
		
		System.out.println(average);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>average)
			{
				count++;
				System.out.println("bigger than average value." + arr[i]);
			}
		}
		System.out.println(count);		
	}
}
