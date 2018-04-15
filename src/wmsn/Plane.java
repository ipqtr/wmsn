package wmsn;

public class Plane {
	public final static int width = 1000;
	public final static int height = 2000;
	public static Coordinates [][] plane = new Coordinates[height][width];

	public Plane()
	{
		for(int x = 0; x < height; x++)
			for(int y = 0; y < width; y++)
				plane[x][y] = new Coordinates(x,y);
	}
	
	
	public void show()
	{
		for(int x = 0; x < height; x++)
		{
			for(int y = 0; y < width; y++)
				System.out.print("["+plane[x][y].x +","+ plane[x][y].y+","+ plane[x][y].content+"]    ");
		System.out.println("done");
		}
		
	}
	public void insert(String content, int x, int y)
	{
		plane[x][y].add(content);
	}
}
