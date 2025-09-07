package stringprog;

public class AnagramWithoutMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "silent";
		
		if(s1.length()!= s2.length())
		{
			System.out.println("Not Anagram");
			return;
		}
		
		int[]count = new int[256];
		
		for(int i=0; i<s1.length(); i++)
		{
			char ch = s1.charAt(i);
			count[ch] = count[ch]+1;
		}
		for(int i=0; i<s2.length();i++)
		{
			char ch = s2.charAt(i);
			count[ch] = count[ch]-1;
		}
		boolean isAnagram = true;
		for(int i=0; i<256; i++)
		{
			if(count[i]!=0)
			{
				isAnagram = false;
				break;
			}
			
		}
		if(isAnagram)
		{
			System.out.println("String Are Anagram");
		}
		else {
			System.out.println("String Are not Anagram");
		}
			
	}
}
