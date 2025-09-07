package stringprog;

import java.util.Scanner;

public class CountStringWords 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		int count = 0;
		
		boolean b = true;
		
		 for(int i=0; i<str.length(); i++)
		 {
			 if(str.charAt(i)== ' ' ||str.charAt(i)=='\t' || str.charAt(i)=='\n')
			 {
				 b=true;
			 }
			 else if(b==true)
			 {
				 b=false;
				 count++;
			 }
		 }
		 System.out.println("Total Words Count is:"+count);
	}
}
