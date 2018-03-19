package Lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo(Word rhs)
	{
		if(word.length() > rhs.toString().length() )
		{
			return 1;
		}
		if(word.length() < rhs.toString().length())
		{
			return -1;
		}
		
		
		else
		{
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)<rhs.toString().charAt(i))
				{
					return -1;
				}
				if(word.charAt(i) > rhs.toString().charAt(i))
				{
					return 1;
				}
			}
		}
		return 0;
	}

	public String toString()
	{
		return word;
	}
}