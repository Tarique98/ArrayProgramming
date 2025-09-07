// Quest-12 -> WAJP to reverse each element of the array.

package arrayProgramming;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[]arr = {10,20,30,40,50,60,70};
		
		
		int start = 0;
		int end = arr.length-1;
		
		
			while(start<end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		
	}
}
