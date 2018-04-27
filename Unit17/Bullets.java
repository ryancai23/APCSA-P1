//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
<<<<<<< HEAD
import java.awt.Component;
=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Arrays;
=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;
<<<<<<< HEAD
	private boolean load = true;
	private int timer = 20;
	private int tick = 0;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}


=======

	public Bullets()
	{
	}

	public void add(Ammo al)
	{
	}
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
<<<<<<< HEAD
		for (Ammo a : ammo)
			a.draw(window);
=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public void moveEmAll()
	{
<<<<<<< HEAD
		for (Ammo a : ammo)
			a.move("UP");
=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public void cleanEmUp()
	{
<<<<<<< HEAD
		for (int i = 0; i < ammo.size(); i++) {
			if (ammo.get(i).getY() < 0) {
				ammo.remove(i);
				i--;
			}
		}
=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public List<Ammo> getList()
	{
<<<<<<< HEAD
		return ammo;
	}
	public void add(Ammo al) 
	{
		if (load){
			ammo.add(al);
		load = false;
		} 
	}
	public void timeiskey() 
	{
		tick++;
		if (tick >= timer) {
			load = true;
			tick = 0;
		}
=======
		return null;
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public String toString()
	{
<<<<<<< HEAD
		return Arrays.toString(ammo.toArray());

	}

	public List<Ammo> getAmmo() {
		return ammo;
	
=======
		return "";
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}
}
