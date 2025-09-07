//Quest - > WAJP to print the even elements of the array.

package arrayProgramming;

public class EvenElement 
{
	public static void main(String[] args) 
	{
		int[]arr = {1,2,4,6,8,9};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println("Even Element Is: "+arr[i]);
			}
		}
	}
}
