package BackTracking;

public class MaxAreaOfIsland {

	public static void main(String[] args) {
		int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		int sr = 0;
		int sc = 0;
		int color = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("-----------------------------------------------");
		int max = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1 && visited[i][j] == false) {
					int pans = IslandSizecalculator(grid, i, j, visited);
					if (pans > max) {
						max = pans;
					}
				}
			}
		}
		System.out.println(max);
	}

	public static int IslandSizecalculator(int[][] grid, int sr, int sc, boolean[][] visited) {
		if (sr < 0 || sc < 0 || sr == grid.length || sc == grid[0].length || grid[sr][sc] == 0
				|| visited[sr][sc]) {
			return 0;
		}
		int sum = 1;
		visited[sr][sc] = true;
		sum += IslandSizecalculator(grid, sr, sc + 1, visited);
		sum += IslandSizecalculator(grid, sr - 1, sc, visited);
		sum += IslandSizecalculator(grid, sr, sc - 1, visited);
		sum += IslandSizecalculator(grid, sr + 1, sc, visited);
		return sum;
	}

}
