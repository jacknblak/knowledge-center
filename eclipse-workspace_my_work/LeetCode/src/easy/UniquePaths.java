package easy;

public class UniquePaths {
	public static void main(String[] args) {
		int column = 7;
		int row = 3;
		System.out.println(uniquePaths(column,row));
	}

	private static int uniquePaths(int column, int row) {
		// TODO Auto-generated method stub
		int tempArray[][] = new int [row][column];
		for(int i = 0 ; i < row;i++) {
			tempArray[i][0] = 1;
		}
		for(int i = 0 ; i < column;i++) {
			tempArray[0][i]=1;
		}
		for(int i = 1; i < row;i++) {
			for(int j = 1; j < column;j++) {
				tempArray[i][j] = tempArray[i][j-1]+tempArray[i-1][j];
			}
		}
		return tempArray[row-1][column-1];
	}

}
