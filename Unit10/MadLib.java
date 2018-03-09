//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		loadNouns();
		loadVerbs();
		loadAdjectives();
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine())
			{
				nouns.add(file.nextLine());
			}
		
		
		
		
		
		
	
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unitt10\\src\\nouns.dat"));
			while(file.hasNextLine())
			{
				nouns.add(file.nextLine());
			}
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unitt10\\src\\verbs.dat"));
			while(file.hasNextLine())
			{
				verbs.add(file.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
			out.println("Verbs not loaded");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unitt10\\src\\adjectives.dat"));
			while(file.hasNextLine())
			{
				adjectives.add(file.nextLine());
			}
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
	
		int i=(int) Math.floor(Math.random()*verbs.size());
		return verbs.get(i);
	}
	
	public String getRandomNoun()
	{
		
		int i=(int) Math.floor(Math.random()*nouns.size());
		return nouns.get(i);
	}
	
	public String getRandomAdjective()
	{
		
		int i=(int) Math.floor(Math.random()*adjectives.size());
		return adjectives.get(i);
	}		

	public String toString()
	{
	
		return "the " +getRandomNoun() + " "+getRandomVerb()+" after the " + getRandomAdjective() +" "+ getRandomAdjective() + " "+ getRandomNoun()+" while the "+ getRandomNoun() +" "+ getRandomVerb()+ " the " + getRandomNoun();
	}
}