void setup()
{
	size(400,400);
	noLoop();
}
void draw()
{
	Die hello = new Die (50,50);
	hello.show();
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
		//your code here
	}
	void show()
	{
		noStroke();
		rect(myX,myY,50,50,10);
	}
}
