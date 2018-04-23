//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;
	private int time;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i=0;i<aliens.size();i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		time++;
		for (Alien alien : aliens) {
			if (time <= 200) {
				alien.move("LEFT");
			} else if (time <= 300) {
				alien.move("DOWN");
			} else if (time <= 500) {
				alien.move("RIGHT");
			} else if (time <= 600) {
				alien.move("UP");
			} else {
				time = 0;
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
	}

	public String toString()
	{
		return "";
	}
}
