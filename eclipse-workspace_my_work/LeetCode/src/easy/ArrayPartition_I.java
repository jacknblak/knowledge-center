package easy;

import java.util.Arrays;
import java.util.Collections;

public class ArrayPartition_I {
	public static void main(String[] args) {
		int inputArray[] = {1,4,3,2};
		System.out.println(arrayPairSum(inputArray));
	}

	private static int arrayPairSum(int[] inputArray) {
		// TODO Auto-generated method stub
		int result = 0 ; 
		Arrays.parallelSort(inputArray);
		for(int i = 0 ; i < inputArray.length;i= i+2) {
			result += inputArray[i];
		}
		return result;
	}

}
