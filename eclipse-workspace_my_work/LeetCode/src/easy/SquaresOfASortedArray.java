package easy;

import java.util.Arrays;
import java.util.List;

public class SquaresOfASortedArray {
	public static void main(String[] args) {
		int inputArray [] = {-7,-3,2,3,11};
		System.out.println(Arrays.toString(sortedSquareArray(inputArray)));
	}

	private static int[] sortedSquareArray(int[] inputArray) {
		// TODO Auto-generated method stub
		int result [] = new int[inputArray.length];
		int start = 0 ; 
		int end = inputArray.length-1;
		int resultIndexFromLast = inputArray.length -1 ; 
		while(start <= end) {
			if(Math.abs(inputArray[start]) > Math.abs(inputArray[end])) {
				result[resultIndexFromLast--] = inputArray[start]*inputArray[start];
				start++;
			}else {
				result[resultIndexFromLast--] = inputArray[end]*inputArray[end];
				end -- ; 
			}
		}
		return result;
	}

}
