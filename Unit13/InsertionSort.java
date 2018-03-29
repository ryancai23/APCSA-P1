//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();
	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(word))
			{
				break;
			}
		}
		loc = Collections.binarySearch(list, word);
		if(loc<0)
		{
			list.add(Math.abs(loc+1), word);
		}
	}


	public void remove(String word)
	{
		int loc=Collections.binarySearch(list, word);
		list.remove(word);
	}

	public String toString()
	{
		String output = "";
		for(int i=0;i<list.size();i++)
		{
			output+= list.get(i) + " ";
		}
		return output;
	}
}