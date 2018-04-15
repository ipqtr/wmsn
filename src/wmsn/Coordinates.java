package wmsn;

public class Coordinates {
	 public int x;
	 public int y;
	 public String content;
	
	public Coordinates(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void print()
	{
		System.out.println("x value is: " + x + "and y value is : " + y);
	}
	public void add(String content)
	{
		this.content = content;
	}
	
}
