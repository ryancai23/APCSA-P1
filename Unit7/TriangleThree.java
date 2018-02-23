//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;
   private String output = "";

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		for(int i=1;i<=size;i++)
		{
			for(int j = size;j>i;j--)
			{
				output = output + " ";
			}
			for(int x = 1;x<=i;x++)
			
				output = output + letter;
			
			output =output + "\n";
		}
		return output;
	}
		

	public String toString()
	{
		return output + "\n";
	}
}