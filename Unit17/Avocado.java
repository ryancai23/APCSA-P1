import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Avocado extends MovingThing{
	private int speed;
	private int time =0;
	private Image image;
	public Avocado()
	{
		this(0,0,30,30,0);
	}

	public Avocado(int x, int y)
	{
		super(x,y);
	}

	public Avocado(int x, int y, int s)
	{
		super(x,y);
		speed =s;
	}

	public Avocado(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		try
		{
			URL url = getClass().getResource("avocado.png");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("messed up");
		}
	}
	
	

	

   public void move(String direction)
	{
	   if(direction.equals("UP"))
	   {
		   setY(getY()-getSpeed());
	   }
	   if(direction.equals("DOWN"))
	   {
		   setY(getY()+getSpeed());
	   }
	   if(direction.equals("LEFT"))
	   {
		   setX(getX()-getSpeed());
	   }
	   if(direction.equals("RIGHT"))
	   {
		   setX(getX()+getSpeed());
	   }
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
	

	public String toString()
	{
		return super.toString() + getSpeed();
	}
	
	public void setSpeed(int s) {
		speed = s;		
	}


	public int getSpeed() {
		return speed;
	}
		
	public void moveAvo()
	{
		time++;
		
			if (time <= 200) {
				this.move("LEFT");
			} else if (time <= 220) {
				this.move("DOWN");
			} else if (time <= 420) {
				this.move("RIGHT");
			} 
			 else if (time <= 440) {
					this.move("DOWN");
					time=0;

			 
		}
	}
	public void setVisible(boolean b) {
		if(b == false)
		{
			setHeight(1);
			setWidth(1);
		}
		
	}

	
}
