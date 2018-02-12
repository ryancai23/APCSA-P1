//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		name = s;

	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		int hi = name.indexOf(" ");
		return name.substring(0,hi);
	}

	public String getLast()
	{
		int hi = name.indexOf(" ");
		return name.substring(hi, name.length());
	}

 	public String toString()
 	{
 		
 		return name;
	}
}