package easy;

public class FlippingAnImage {
	public static void main(String[] args) {
		int inputArray[][] = {{1,1,0},{1,0,1},{0,0,0}};
		printArray(inputArray);
		System.out.println();
		inputArray = findAndInvertImage(inputArray);
		printArray(inputArray);
	}

	private static int[][] findAndInvertImage(int[][] inputArray) {
		// TODO Auto-generated method stub
		int tempArry[][] = new int[inputArray.length][inputArray[0].length];
		for(int i = 0 ; i < inputArray.length; i ++) {
			for(int j = 0 ; j <inputArray[i].length; j ++) {
//				if(inputArray[i][inputArray[i].length-1-j] == 0) {
//					inputArray[i][j] = 1;
//				}else {
//					inputArray[i][j] = 0;
//				}
				int temp1 = inputArray[i][(inputArray[i].length - j)-1];
				int temp = 1 - temp1;
				tempArry[i][j] = temp;
			}
		}
		return tempArry;
		
	}

	private static void printArray(int[][] inputArray) {
		// TODO Auto-generated method stub
		for(int i = 0 ; i < inputArray.length;i ++) {
			for (int j = 0 ; j < inputArray[i].length;j++) {
				System.out.print(inputArray[i][j]);
			}
			System.out.println();
		}
		
	}

}
