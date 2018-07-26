package ticTacToe;

public class Board {
	
	private Character[][] grid = new Character[3][3];
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				result.append((grid[i][j] == null ?  "_" : grid[i][j]) + " ");
			}
			result.append("\n");
		} 
		return result.toString();
	}
	
	public Character[][] getGrid() {
		return grid;
	}
	
	
	public boolean placeCharacter(char c, int x, int y) {
		if (grid[x][y] == null) {
			grid[x][y] = c;
			return true;
		}
		return false;
	}  
}
