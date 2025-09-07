// Quest-18 -> WAJP to rotate each element of an array by one position in right side.

package arrayProgramming;

import java.util.Arrays;

public class OnePositionRightSide 
{
	public static void main(String[] args) 
	{
		int[]arr = {10,20,30,40,50,60,70};
		int n = arr.length;
		
		int temp = arr[n-1];
		
		for(int i=n-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		System.out.println("Rotate Array:"+Arrays.toString(arr));
	}
}
