//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{

	}

   public FancyWord(String s)
	{
	   mat = new char[s.length()][s.length()];
	   for(int i=0;i<s.length();i++)
	   {
		   mat[0][i] = s.charAt(i);
		   if(i!=0)
		   {
			   mat[i][i] = s.charAt(i);
			   mat[s.length()-i-1][i] = s.charAt(i);
		   }
		   mat[s.length()-1][i] = s.charAt(i);
	   }
	 

	}

	public String toString()
	{
		String output="";
		for(int k=0; k<mat[0].length;k++)
		{
		
		for(int i=0;i<mat[0].length;i++)
		{
			output = output + mat[k][i];
		}
			output = output + "\n";
		}


		return output+"\n\n";
	}
}