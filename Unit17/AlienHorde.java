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
<<<<<<< HEAD
	private int size;

	public AlienHorde(int s)
	{
		aliens = new ArrayList<Alien>();
		size = s;

=======

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
<<<<<<< HEAD
		for (Alien al : aliens)
			al.draw(window);
=======
		for(int i=0;i<aliens.size();i++)
		{
			aliens.get(i).draw(window);
		}
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public void moveEmAll()
	{
		time++;
		for (Alien alien : aliens) {
<<<<<<< HEAD
			if (time <= 120)
				alien.move("RIGHT");
			else if (time <= 320)
				alien.move("DOWN");
			else if (time <= 440)
				alien.move("LEFT");
			else if (time <= 640)
				alien.move("UP");
			else if (time <= 1000)
				time = 0;
=======
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
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
<<<<<<< HEAD
		for(int i=0;i<shots.size();i++)
		{
			for(int j=0;j<aliens.size();j++)
			{
				try {
					if (shots.get(i).Collide(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						i--;
						j--;
					}
				} catch (ArrayIndexOutOfBoundsException e) {

				}
			}
		}
	}
	public List<Alien> getAliens() {
		return aliens;
	}

	public int getSize() {
		return size;
	}
=======
	}

>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	public String toString()
	{
		return "";
	}
<<<<<<< HEAD

	
}
=======
}
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
