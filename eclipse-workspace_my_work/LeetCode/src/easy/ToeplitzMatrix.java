package easy;

public class ToeplitzMatrix {
	/*
	 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the
	 * same element.
	 * 
	 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: matrix = [ [1,2,3,4], [5,1,2,3], [9,5,1,2] ] Output: True Explanation:
	 * In the above grid, the diagonals are: "[9]", "[5, 5]", "[1, 1, 1]",
	 * "[2, 2, 2]", "[3, 3]", "[4]". In each diagonal all elements are the same, so
	 * the answer is True. Example 2:
	 * 
	 * Input: matrix = [ [1,2], [2,2] ] Output: False Explanation: The diagonal
	 * "[1, 2]" has different elements.
	 */
	public static void main(String[] args) {
		int inputMatrix[][] = { { 11,74,0,93 }, { 40,11,74,7 } };
		System.out.println("Matrix is Teoplitx Matrix : " + checkIfMatrixTeoplitz(inputMatrix));
	}

	private static boolean checkIfMatrixTeoplitz(int[][] inputMatrix) {
		/*
		 * First we check in row and then column
		 */

		int index = 0;
		while (index < inputMatrix.length) {
			int row = index++;
			int column = 0;
			while(row+1 <inputMatrix.length && column+1 < inputMatrix[row].length) {
				if(inputMatrix[row][column] != inputMatrix[++row][++column]) {
					return false;
				}
			}

		}
		index = 0;
		while (index < inputMatrix[0].length) {
			int row = 0;
			int column =index++;
			while(row+1 <inputMatrix.length && column+1 < inputMatrix[row].length) {
				if(inputMatrix[row][column] != inputMatrix[++row][++column]) {
					return false;
				}
			}

		}
		
		return true;
	}
}
