package wmsn;

public class Plane {
	public final static int columns = 1000;
	public final static int rows = 2000;
	public static Coordinates [][] plane = new Coordinates[rows][columns];

	public Plane()
	{
		for(int c = 0; c < columns; c++)
			for(int r = 0; r < rows; r++)
				plane[r][c] = new Coordinates(r,c);
	}
	
	
	public void show()
	{
		for(int r = 0; r < rows; r++)
		{
			for(int c = 0; c < columns; c++)
				System.out.print("["+plane[r][c].r +","+ plane[r][c].c+","+ plane[r][c].coverage[0].type+"]    ");
		System.out.println("done");
		}
		
	}
	public void insert(String content, int x, int y)
	{
		plane[y][x].add(content);
	}
	
	
	public void draw()
	{
		
		// upper triangle
		for(int r = 0; r < 501; r+=99)
		{
			plane[r][r].coverage[0].type = Node.ROADSIDE_NODE;
			
			for(int i = 0 ; i < 100 ; i++)
			{
			for (int rr = r; rr < (r+100); rr++)
			{
				for (int cc = r; cc < (r+100); cc++)
				{
					if(rr+i < rows && rr > 0 && cc < columns && cc > 0)
						plane[rr+i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					if(rr < rows && rr-i > 0 && cc < columns && cc > 0)
						plane[rr-i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					
					if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
						plane[rr][cc+i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
						plane[rr][cc-i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					
					}
				}
			}
		}

			
		
		
		for(int r = 500; r < 1000; r+=99)
		{
			plane[1000-r][r].coverage[0].type = Node.ROADSIDE_NODE;
			for(int i = 0 ; i < 100 ; i++)
			{
				for (int rr = r; rr < (r+100); rr++)
				{
					for (int cc = r; cc < (r+100); cc++)
				{
					
						if(rr+i < rows && rr > 0 && cc < columns && cc > 0)
							plane[rr+i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(rr < rows && rr-i > 0 && cc < columns && cc > 0)
							plane[rr-i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc+i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc-i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					
					
					}
				}
			}

		}
		// lower triangle
		for(int r = 200; r < 501; r+=99)
		{
			plane[2000-r][r].coverage[0].type = Node.ROADSIDE_NODE;
			for(int i = 0 ; i < 100 ; i++)
			{
				for (int rr = r; rr < (r+100); rr++)
				{
					for (int cc = r; cc < (r+100); cc++)
				{
						if(rr+i < rows && rr > 0 && cc < columns && cc > 0)
							plane[rr+i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(rr < rows && rr-i > 0 && cc < columns && cc > 0)
							plane[rr-i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc+i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc-i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					
					}
				}
			}
		}
		
		for(int r = 500; r < 1000; r+=99)
		{
			plane[1000-r][r].coverage[0].type = Node.ROADSIDE_NODE;
			for(int i = 0 ; i < 100 ; i++)
			{
				for (int rr = r; rr < (r+100); rr++)
				{
					for (int cc = r; cc < (r+100); cc++)
				{
						if(rr+i < rows && rr > 0 && cc < columns && cc > 0)
							plane[rr+i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(rr < rows && rr-i > 0 && cc < columns && cc > 0)
							plane[rr-i][cc].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc+i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
						if(cc+i<columns && cc -i > 0 && rr < rows & rr > 0)
							plane[rr][cc-i].coverage[0].type = Node.ROADSIDE_NODE_COVERAGE;
					
					
					}
				}
			}
		}
	}
	
	
	
//	public void placeVN() // place VehicularNodes
//	{
//		// We need to place VehicularNodes on the Canvas
//		for(int r = 0; r < rows; r++)
//		{
//			for(int c = 0; c < columns; c++)
//				plane[r][c].coverage.
//		}
//	}
	
}
