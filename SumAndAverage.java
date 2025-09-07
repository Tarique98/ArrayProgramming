// Quest-5 -> WAJP to print sum and average of all the elements of array.
package arrayProgramming;

public class SumAndAverage 
{
	public static void main(String[] args) 
	{
		int[]arr = {2,4,6,7,9};
		int sum=0;
		int average=0;
		
		System.out.println("sum and average of all the elements of array");
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum: "+sum);
		average = sum/2;
		System.out.println("Average: "+average);
	}
}
