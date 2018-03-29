//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(int i=0;i<wordRay.length;i++)
		{
			if(wordRay[i].length()> max)
			{
				max = wordRay[i].length();
			}
		}
		for(int i=1;i<=max;i++)
		{
			for(int k=wordRay.length-1;k>=0;k--)
			{
				if(wordRay[k].length()-i < 0)
				{
					output+=" ";
				}
				if(wordRay[k].length()-i >= 0)
				{
					output+=wordRay[k].charAt(wordRay[k].length()-i);
				}
			}
			output += "\n";
		}



		return output+"\n\n";
	}
}