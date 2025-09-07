// Quest-17 -> WAJP to remove an element from the certain position of the array.
package arrayProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]a= {23,45,34,56,45,56,45,67,45};
		System.out.println("Enter the Index to remove:");
		int ind = sc.nextInt();
		
		int[]b = removeElement(a,ind);
		System.out.println("OriginalArray:"+Arrays.toString(a));
		System.out.println("new OriginalArray:"+Arrays.toString(b));
	}
	public static int[] removeElement(int[]a,int index)
	{
		if(index>=a.length)
		{
			System.out.println("Given Index is not applicable ");
		}
		int[]b = new int[a.length-1];
		
		for(int i=0; i<b.length;i++)
		{
			if(i<index)
				b[i] = a[i];
			else
				b[i] = a[i+1];
		}
		return b;
	}
}
