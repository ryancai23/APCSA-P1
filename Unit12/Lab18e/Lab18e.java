package Lab18e;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Lab18d.Word;

import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\rcais\\eclipse-workspace\\Unitt12\\src\\Lab18e\\lab18e.dat"));
		ArrayList<Word> words = new ArrayList<Word>();
		
		int size = file.nextInt();
		file.nextLine();
		while (file.hasNextLine())
			words.add(new Word(file.nextLine()));
		System.out.println(words);
		for (int j=0;j<words.size()-1;j++){
		for (int i=0;i<words.size()-1;i++){
			if(words.get(i).compareTo(words.get(i+1))>0){
				Word temp  = words.get(i);
				words.set(i, words.get(i+1));
				words.set(i+1, temp);
			}
		}}
		for (int i =0;i<words.size();i++){
			System.out.println(words.get(i));
		}







	}
}