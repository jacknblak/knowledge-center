package easy;

public class IslandPerimeter {
	/*
	 * You are given a map in form of a two-dimensional integer grid where 1
	 * represents land and 0 represents water.
	 * 
	 * Grid cells are connected horizontally/vertically (not diagonally). The grid
	 * is completely surrounded by water, and there is exactly one island (i.e., one
	 * or more connected land cells).
	 * 
	 * The island doesn't have "lakes" (water inside that isn't connected to the
	 * water around the island). One cell is a square with side length 1. The grid
	 * is rectangular, width and height don't exceed 100. Determine the perimeter of
	 * the island.
	 * 
	 * 
	 * 
	 * Example:
	 * 
	 * Input: [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
	 * 
	 * Output: 16
	 */
	public static void main(String[] args) {
		int islandPoints[][] = {{1}};
		System.out.println("Peremeter of islans is : "+getPeremeter(islandPoints));
	}

	private static int getPeremeter(int[][] islandPoints) {
		// TODO Auto-generated method stub
		int peremeter = 0;
		for(int row = 0 ; row < islandPoints.length;row++) {
			for(int col = 0 ; col < islandPoints[row].length;col++) {
				if(islandPoints[row][col] ==1 ) {
					if(col == 0 ) {
						peremeter++;
					}
					if( col == islandPoints[row].length-1){
						peremeter++;
					}
					if(col > 0  ||  col <islandPoints[row].length-1 ){
						if(col > 0 && islandPoints[row][col-1] == 0) {
							peremeter++;
						}
						if(col <islandPoints[row].length-1 && islandPoints[row][col+1] == 0) {
							peremeter++;
						}
					}
					
					if(row == 0 ) {
						peremeter++;
					}
					if( row == islandPoints.length-1){
						peremeter++;
					}
					if(row > 0 ||  row <islandPoints.length ){
						//System.out.println();
						if(row > 0 && islandPoints[row-1][col] == 0) {
							peremeter++;
						}
						if(row <islandPoints.length-1 && islandPoints[row+1][col] == 0) {
							peremeter++;
						}
					}
				}
			}
		}
		return peremeter;
	}

}
