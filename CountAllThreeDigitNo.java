// Quest-4 ->WAJP to print and count all the three digit numbers of the array.
package arrayProgramming;

public class CountAllThreeDigitNo 
{
	public static void main(String[] args) 
	{
		int[]arr = {124,4,54,5,6,99};
		int count=0;
		
		System.out.println("Three Digit Number in Array:");
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>=99 && arr[i]<=999)
			{
				count++;
			}
		}
		System.out.println("Count:"+count);
	}
}
