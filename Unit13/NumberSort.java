//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while(number >= 10)
		{
			number = number/10;
			count++;
		}
		count++;
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = null;
		int count = getNumDigits(number);
		sorted = new int[count];
		
		for(int i=count-1;i>=0;i--)
		{
			sorted[i] = (int) (number%10);
			number = number/10;
		}
		for(int k=0;k<count;k++)
		{
			int val=sorted[k];
			int step=k;
			while(step>0&&val<sorted[step-1])
			{
				sorted[step] = sorted[step-1];
				step--;
			}
			sorted[step]=val;
		}
		return sorted;
	}
}