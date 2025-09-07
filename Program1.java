//Quest-1 WAJP to print the even index elements of the array.
package arrayProgramming;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		int[]arr = {2,4,5,3,6,7,8,9};
		
		System.out.println("Even index elements of the array are:");
		for(int i=0; i<arr.length; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("index:"+i+" -> "+arr[i]);
			}
		}
		
	}

}
