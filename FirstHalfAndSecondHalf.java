// Quest-12 -> WAJP to reverse 1st half and 2nd half elements of array.

package arrayProgramming;

public class FirstHalfAndSecondHalf 
{
	public static void main(String[] args) 
	{
		int[]arr = {10,20,30,40,50,60,70};
		int n = arr.length;
		
		int start = 0;
		int end = (n/2)-1;
		
		while(start<end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		 start = (n%2==0)?(n/2):(n/2)+1;
		 end = n-1;
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
