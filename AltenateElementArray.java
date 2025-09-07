// Quest-12 -> WAJP to print alternate element of the array from end.

package arrayProgramming;

public class AltenateElementArray 
{
	public static void main(String[] args) 
	{
		int[]arr = {10,20,30,40,50,33};
		for(int i=0; i<arr.length;i++)
		{
			if(i % 2==0)
			{
				System.out.println("The Alternate Element are:"+arr[i]);
				
			}
		}
	}
}
