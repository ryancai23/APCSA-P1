//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{


	}

	public Prime(int num)
	{
		number = num;

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public boolean isPrime()
	{
		int lol = 0;
		for(int i = 2;i<number;i++)
			if(number%i == 0)
				lol++;
		if(lol > 0)
			return true;
		else
			return false;
	}

	public String toString()
	{
		if(isPrime())
			return number + " is not a prime number";
		else
			return number + " is a prime number";






		
	}
}