// Quest-5 -> WAJP to check no is even or odd without using if else/Conditional Operator statement.
package arrayProgramming;

import java.util.Scanner;

public class CheckEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		String[] result = {"Even","Odd"};
		System.out.println("The Number is:"+result[num%2]);
	}
}
