package Lab18d;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\rcais\\eclipse-workspace\\Unitt12\\src\\Lab18d\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		Word[] listo = new Word[size];
		for(int i=0;i<size;i++)
		{
			Word dub = new Word(file.nextLine());
			listo[i] = dub;
		}
		Word champ = new Word(listo[0].toString());
		for(int i =0;i<size;i++)
		{
		for(int z=0;z<size-1;z++)
		{
			if(listo[z].compareTo(listo[z+1]) ==1)
			{
				champ = listo[z+1];
				listo[z+1] = listo[z];
				listo[z] = champ;
			}
		}
		
		}
		for (int i = 0; i < listo.length; i++){
			System.out.println(listo[i]);
		}




	}
}