// Quest-18 ->WAJP to insert an element at certain position of the array.

package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]a = {23,45,34,56,45,56,45,67,45};
		
		System.out.println("Enter the Value:");
		int val = sc.nextInt();
		
		System.out.println("Enter the index:");
		int ind = sc.nextInt();
		
		int[]b = insertElement(a,ind,val);
		System.out.println("Original Array:"+Arrays.toString(a));
		System.out.println("New Array:"+Arrays.toString(b));
	}
	public static int[] insertElement(int[]a,int index,int value)
	{
		if(index>a.length)
		{
			System.out.println("Given index is not applicable:");
			return a;
		}
		int[]b = new int[a.length+1];
		b[index] = value;
		
		for(int i=0;i<b.length;i++)
		{
			if(i<index)
			{
				b[i] = a[i];
			}
			else if(i>index)
				b[i] = a[i-1];
		}
		return b;
		
	}
}
