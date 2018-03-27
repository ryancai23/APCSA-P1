//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean truther = false;

	public Maze()
	{
		

	}

	public Maze(int size, String line)
	{
		maze = new int[size][size];
		Scanner liner = new Scanner(line);
		for(int i=0;i<size;i++)
		{
			for(int k = 0;k<size;k++)
			{
				maze[i][k] = liner.nextInt();
			}
		}
	}

	public void hasExitPath(int r, int c)
	{
		int fit = maze.length;
		if(r >= 0 && r < fit && c >= 0 && c < fit)
			if(maze[r][c] == 1) 
			{
			maze[r][c] = 0;
			if(c == maze[r].length-1) {
				truther = true;
				
			}
			else {
				hasExitPath(r-1,c);
				hasExitPath(r,c+1);
				hasExitPath(r+1,c);
				hasExitPath(r,c-1);
			}
	
		}
	}

	public String toString()
	{
		String output= "";
		hasExitPath(0,0);
		if(truther)
		{
			output = "exit found";
		}
		else
			output = "exit not found";




		return output;
	}
}