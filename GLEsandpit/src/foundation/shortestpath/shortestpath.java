package foundation.shortestpath;


public class shortestpath {
	
	public int[][] floyd(int[][] lengths)
	{
		int[][] shortestpath;
		
		shortestpath = lengths;
		
		for (int k = 0 ; shortestpath.length > k; k++)
			for(int i = 0 ; shortestpath.length > i; i++)
				for(int j = 0 ; shortestpath.length > j; j++)
					shortestpath[i][j] = Math.min(shortestpath[i][j], shortestpath[i][k] + shortestpath[k][j]);
		
		return shortestpath;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] lengths = new int[3][3];
		
		lengths[0][0] = 1;
		lengths[0][1] = 3000;
		lengths[0][2] = 3;
		lengths[1][0] = 1;
		lengths[1][1] = 3;
		lengths[1][2] = 30000;
		lengths[2][0] = 1;
		lengths[2][1] = 3;
		lengths[2][2] = 3;
		
		shortestpath fl = new shortestpath();
		
		fl.floyd(lengths);
		
		fl.printgraph(lengths);
		
	}

	public void printgraph(int[][] shortestpath)
	{


			for(int i = 0 ; shortestpath.length > i; i++)
				for(int j = 0 ; shortestpath.length > j; j++)
					System.out.println("shortest path from [" + i + "] to [" + j + "] is :" + shortestpath[i][j]);
		

	}
	
}
