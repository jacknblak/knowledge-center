package easy;

public class AvailableCapturesForRook {
	public static void main(String[] args) {
		String inputBoard[][] = { { ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", "p", ".", ".", ".", "." }, { ".", ".", ".", "R", ".", ".", ".", "p" },
				{ ".", ".", ".", ".", ".", ".", ".", "." }, { ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", "p", ".", ".", ".", "." }, { ".", ".", ".", ".", ".", ".", ".", "." },
				{ ".", ".", ".", ".", ".", ".", ".", "." } };
		System.out.println(numCapturedByRook(inputBoard));

	}

	private static int numCapturedByRook(String[][] inputBoard) {
		// TODO Auto-generated method stub
		int result = 0;
		/*
		 * first find out where is rook
		 */
		int xAxis = -1;
		int yAxis = -1;
		boolean found = false;
		for (int i = 0; i < 8 && !found; i++) {
			for (int j = 0; j < 8; j++) {
				if (inputBoard[i][j].equals("R")) {
					xAxis = i;
					yAxis = j;
					found = true;
					break;
				}

			}
		}
		for(int i = xAxis ; i >=0; i--) {
			if(inputBoard[i][yAxis] == "p") {
				result++;
				break;
			}
			if(inputBoard[i][yAxis] == "B") {
				break;
			}
		}
		for(int i = xAxis ; i <8; i++) {
			if(inputBoard[i][yAxis] == "p") {
				result++;
				break;
			}
			if(inputBoard[i][yAxis] == "B") {
				break;
			}
		}
		for(int i = yAxis ; i >=0; i--) {
			if(inputBoard[xAxis][i] == "p") {
				result++;
				break;
			}
			if(inputBoard[xAxis][i] == "B") {
				break;
			}
		}
		for(int i = yAxis ; i <8; i++) {
			if(inputBoard[xAxis][i] == "p") {
				result++;
				break;
			}
			if(inputBoard[yAxis][i] == "B") {
				break;
			}
		}

		return result;
	}

}
