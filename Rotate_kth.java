// Quest-20 -> WAJP to rotate all the elements of array k position to its right.

package arrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_kth 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[]a = {1,2,3,4,5,6,7};
		System.out.println("Enter the Roation value");
		int k = sc.nextInt();
		
		 rightRotate(a, k);
		System.out.println("New Original Array:"+Arrays.toString(a));
	}
	public static void rightRotate(int[]a,int k)
	{
		k=k%a.length;
		if(k==0)
			return;
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
	}
	public static void reverse(int[]a,int start,int end)
	{
		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++; end--;
		}
	}
}
