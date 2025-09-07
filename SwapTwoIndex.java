// Quest-12 -> WAJP to swap two index values of the array.

package arrayProgramming;

public class SwapTwoIndex 
{
	public static void main(String[] args)
	{
		int[]arr = {10,20,30,40,50,60,70};
		System.out.println("Original Array:");
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
		int index1 = 1;
		int index2 = 5;
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
		System.out.println("After swapping array:");
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
		
		
		
}
}
