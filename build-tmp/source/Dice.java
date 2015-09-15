import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	
	size(400,400);
	noLoop();
}
public void draw()
{
	background(127);
	int totals = 0;
	for (int y = 15; y <= 350; y = y +75)
	{
		for (int x = 25; x <= 350; x = x + 75)
		{
			Die hello = new Die (x,y);
			hello.show();
			hello.roll();
			if (hello.numNum >= 0)
			{
				totals = totals + hello.numNum;
			}
		}
	}
	text("Total points: " + totals,50,380);
}
public void mousePressed()
{
	redraw();
}


class Die
{
	int myX, myY;
	Die(int x, int y) //constructor
	{
		myX = x;
		myY = y;
	}
	int numNum = (int)(Math.random()*6)+1;
	public void roll()
	{
		
		stroke(0);
		strokeWeight(10);
		if(numNum == 1)
		{
			//1
			point(myX+25,myY+25);
		}
		else if (numNum == 2)
		{
			//2
			point(myX+15,myY+25);
			point(myX+35,myY+25);
		}
		else if (numNum == 3)
		{
			//3
			point(myX+10,myY+12);
			point(myX+25,myY+25);
			point(myX+40,myY+37);
		}
		else if (numNum == 4)
		{
			//4
			point(myX+13,myY+15);
			point(myX+36,myY+15);
			point(myX+13,myY+35);
			point(myX+36,myY+35);
		}
		else if (numNum == 5)
		{
			//5
			point(myX+13,myY+15);
			point(myX+36,myY+15);
			point(myX+25,myY+25);
			point(myX+13,myY+35);
			point(myX+36,myY+35);
		}
		else
		{
			//6
			point(myX+13,myY+13);
			point(myX+36,myY+13);
			point(myX+13,myY+25);
			point(myX+36,myY+25);
			point(myX+13,myY+37);
			point(myX+36,myY+37);
		}
	}
	public void show()
	{
		noStroke();
		rect(myX,myY,50,50,10);
		//roll();
		
	}
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
