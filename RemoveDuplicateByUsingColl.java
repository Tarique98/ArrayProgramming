package stringprog;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveDuplicateByUsingColl 
{
	public static void main(String[] args) 
	{
		int[]a = {12,33,43,12,33,33,56,76,87,};
		removeDuplicate(a);
	}
	public static void removeDuplicate(int[]a)
	{
		Collection c = new ArrayList();
		for(int x:a)
		{
			if(!c.contains(x))
				c.add(x);
		}
		System.out.println("All unique element is are:"+c);
	}
}
