// Quest-12 -> WAJP to reverse 1st half and 2nd half elements of array.

package arrayProgramming;

public class EachElementReverse 
{
	public static void main(String[] args) 
	{
		int[]arr = {23,45,698,654};
		
		System.out.println("Original Array:");
		for(int num:arr)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length;i++)
		{
			int num = arr[i];
			int rev = 0;
			
			while(num>0)
			{
				int digits = num%10;
				rev = rev*10+digits;
				num=num/10;
			}
			arr[i] = rev;
		}
		System.out.println("Array after reversing each element:");
		for(int num: arr)
		{
			System.out.print(num+" ");
		}
	}
}
