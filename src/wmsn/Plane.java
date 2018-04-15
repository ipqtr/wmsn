package wmsn;

import java.util.Arrays;

public class Plane {
	public static Coordinates [][] plane = new Coordinates[100][100];

	public Plane()
	{
		for(int x = 0; x < 100; x++)
			for(int y = 0; y < 100; y++)
				plane[y][x] = new Coordinates(x,y);
	}
	
	
	public void show()
	{
		for(int x = 0; x < 100; x++)
		{
			for(int y = 0; y < 100; y++)
				System.out.print("["+plane[x][y].x +","+ plane[x][y].y+","+ plane[x][y].content+"]    ");
		System.out.println();
		}
		
	}
	public void insert(String content, int x, int y)
	{
		plane[x][y].add(content);
	}
}
