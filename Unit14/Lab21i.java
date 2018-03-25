//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\rcais\\Downloads\\Unit14_2016\\Unit14-Assignments\\lab21i.dat"));
		Maze mazeRunner = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		System.out.println(mazeRunner);
		Maze mazeRunner2 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		System.out.println(mazeRunner2);
		Maze mazeRunner3 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		System.out.println(mazeRunner3);
		Maze mazeRunner4 = new Maze(Integer.parseInt(file.nextLine()), file.nextLine());
		System.out.println(mazeRunner4);
	}
}