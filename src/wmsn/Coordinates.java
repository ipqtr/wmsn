package wmsn;

public class Coordinates {
	 public int r;
	 public int c;
	 public String content;
	 public Node[] coverage = new Node[12];
	
	public Coordinates(int r, int c)
	{

		for(int i = 0; i < 12; i++)
			coverage[0] = new Node(0);
		this.r = r;
		this.c = c;
	}
	public void print()
	{
		System.out.println("row value is: " + r + "and column value is : " + c);
	}
	public void add(String content)
	{
		this.content = content;
	}
	
}
