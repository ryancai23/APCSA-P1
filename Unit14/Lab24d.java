//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\rcais\\eclipse-workspace\\Unitt14\\src\\lab24d.dat"));
		int num = file.nextInt();
		String word;
		for(int i=0;i<num;i++)
		{
			word = file.next();
			TicTacToe ttt = new TicTacToe(word);
			ttt.getWinner();
			System.out.println(ttt);
		}

		




	}
}



