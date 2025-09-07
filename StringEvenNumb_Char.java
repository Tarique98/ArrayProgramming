// Quest-9 -> For the given array of Strings, print and count all the Strings which has even number of characters.

package arrayProgramming;

public class StringEvenNumb_Char 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String[]str = {"hi", "hello", "programming", "java"};
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length() % 2==0)
			{
				count++;
				System.out.println("The Even String is: "+str[i]+". The length is: "+ str[i].length());
			}
		}
		System.out.println("Total Even Strings: " + count);
		
	}
}
