package stringprog;

public class RemoveAllDuplicate 
{
	public static void main(String[] args) 
	{
		String input = "abbc";
		String output = " ";
		
		for(int i=0; i<input.length();i++)
		{
			char ch = input.charAt(i);
			
			boolean alreadyPresent = false;
			
			for(int j=0; j<output.length(); j++)
			{
				if(ch == output.charAt(j))
				{
					alreadyPresent = true;
					break;
				}
			}
			if(!alreadyPresent)
			{
				output = output+ch;
			}
		}
		System.out.println("After removing duplication:"+output);
	}
}
