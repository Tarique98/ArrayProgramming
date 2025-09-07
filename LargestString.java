// Quest-9 -> For the given array of Strings, print the largest string.

package arrayProgramming;

public class LargestString 
{
	public static void main(String[] args) 
	{
		String[]str = {"hi", "hello", "programming", "java"};
		String largest = str[0] ;
		
		for(int i=1;i<str.length;i++)
		{
			if(str[i].length() > largest.length())
			{
				largest = str[i];
			}
			
		}
		System.out.println("Largest String:"+largest);
	}
}
