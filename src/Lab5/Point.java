package Lab5;

public class Point {
	//protected variables
	protected int x;
	protected int y;
	
	//Constructors
	public Point ()
	{
		setX(0);
		setY(0);
	
	}
	public Point (int x, int y )
	{
		this.x = x;
		this.y = y;

	}
	//Getters and setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//toString method
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
