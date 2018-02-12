//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		

	}

	public Quadratic(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;

 	}

	public void calcRoots( )
	{
		rootOne = (-1*b+sqrt(b*b-4*a*c))/(2*a);
		rootTwo = (-1*b-sqrt(b*b-4*a*c))/(2*a);
	}

	public void print( )
	{
		System.out.println(rootOne);
		System.out.println(rootTwo);
	}
}