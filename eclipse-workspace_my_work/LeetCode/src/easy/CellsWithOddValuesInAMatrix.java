package easy;

public class CellsWithOddValuesInAMatrix {
	public static void main(String[] args) {
		int row = 2;
		int column = 3; 
		int indices[][]= {{0,1},{1,1}};
		System.out.println(addCells(indices,row,column));
	}

	private static int addCells(int[][] indices, int row, int column) {
		// TODO Auto-generated method stub
		int rowIndex [] = new int [row];
		int columnIndex[] = new int [column];
		int indicesLength = indices.length;
		for(int i =0 ;i <indicesLength; i++ ) {
			rowIndex[indices[i][0]]++;
			columnIndex[indices[i][1]]++;
		}
		int result = 0 ;
		for(int i = 0 ; i < row; i ++) {
			for(int j = 0 ; j < column ; j ++) {
				if((rowIndex[i]+columnIndex[j])%2 == 1) {
					result++;
				}
			}
		}
		return result;
	}

}
