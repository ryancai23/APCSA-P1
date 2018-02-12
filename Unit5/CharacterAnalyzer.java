//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{
		theChar = c;

	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if(Character.isUpperCase(theChar))
			return true;
		else
			return false;
	}

	public boolean isLower( )
	{

		if(Character.isLowerCase(theChar))
			return true;
		else
			return false;

		
	}
	
	public boolean isNumber( )
	{
		if(Character.isLetter(theChar))
			return false;
		else
			return true;
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		if(Character.isLowerCase(theChar))
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	
		if(Character.isUpperCase(theChar))
			return ""+getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";
		else
			return ""+getChar() + " is number. ASCII == " + getASCII() + "\n";
	}
}