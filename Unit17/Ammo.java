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

<<<<<<< HEAD
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

=======
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
public class Ammo extends MovingThing
{
	private int speed;

	public Ammo()
	{
<<<<<<< HEAD
		this(0,0,5);
=======
		this(0,0,0);
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public Ammo(int x, int y)
	{
<<<<<<< HEAD
		this(x,y, 5);
=======
		super(x,y);
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
		
	}

	public Ammo(int x, int y, int s)
	{
<<<<<<< HEAD
		setPos(x,y);
		setSpeed(s);
=======
		super(x,y);
		speed =s;
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.YELLOW);
<<<<<<< HEAD
		window.fillRect(getX(), getY(), 5, 15);
=======
		window.fillRect(getX(), getY(), 10, 10);
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
	}
	
	
	public void move( String direction )
	{
		 if(direction.equals("UP"))
			{
				setY(getY()-getSpeed());
			}
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 7a9d19b476bf73753455df2187082a5ec0cdab61
