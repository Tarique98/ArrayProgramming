package arrayProgramming;

import java.util.Arrays;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int[]a = {23,12,24,20,16,12,18,8,15,17,19,5};
		System.out.println("Before Sorting:"+Arrays.toString(a));
		sort(a);
		System.out.println("After Sorting:"+Arrays.toString(a));
	}
	public static void sort(int[]a)
	{
		for(int i=1; i<a.length;i++)
		{
			int key = a[i]; int j = i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		for(int num:a)
		{
			System.out.print(num+"");
		}
		
	}
}
