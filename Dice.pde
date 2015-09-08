void setup()
{
	size(400,400);
	noLoop();
}
void draw()
{
	Die hello = new Die (50,50);
	hello.show();
	//hello.roll();
	Die bye = new Die (100,100);
	bye.show();
}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	int myX, myY;
	Die(int x, int y) //constructor
	{
		//variable initializations here
		myX = x;
		myY = y;
		

	}
	void roll()
	{
		int numNum = (int)(Math.random()*6)+1;
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
	void show()
	{
		noStroke();
		rect(myX,myY,50,50,10);
		roll();
		
	}
}
