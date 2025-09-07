package stringprog;

public class MaxOccuringChar 
{
	public static void main(String[] args) 
	{
		  String str = "abdcc bdcddc";
		  
		  int[] arr = new int[126];
		  
		  for(int i=0; i<str.length(); i++)
		  {
			  arr[str.charAt(i)] = arr[str.charAt(i)]+1;
		  }
		  int max = -1;
		  char c = ' ';
		  for(int i=0; i<str.length(); i++)
		  {
			  if(max<arr[str.charAt(i)])
			  {
				  max=arr[str.charAt(i)];
				  c=str.charAt(i);
			  }
		  }
		  System.out.println("Maximum Reapeted Character:"+c);
	}
	
}
