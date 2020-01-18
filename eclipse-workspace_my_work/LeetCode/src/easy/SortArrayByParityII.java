package easy;

import java.util.Arrays;

public class SortArrayByParityII {
	public static void main(String[] args) {
		int inputArray[] = {2,3,1,1,4,0,0,4,3,3};
		System.out.println(Arrays.toString(sortArrayByParity(inputArray)));
	}

	private static int[] sortArrayByParity(int[] inputArray) {
		// TODO Auto-generated method stub
		int evenIndex = 0 ;
		int oddIndex = 1;
		int end = inputArray.length;
		while(evenIndex < end || oddIndex < end) {
			while(evenIndex < end && inputArray[evenIndex] %2 == 0) {
				evenIndex = evenIndex +2;
			}
			while(oddIndex < end && inputArray[oddIndex]%2 == 1) {
				oddIndex +=2;
			}
			if (oddIndex < end && evenIndex < end) {
				int temp = inputArray[evenIndex];
				inputArray[evenIndex] = inputArray[oddIndex];
				inputArray[oddIndex] = temp;
				oddIndex += 2;
				evenIndex += 2;
			}
			
		}
		
		
		return inputArray;
	}

}
