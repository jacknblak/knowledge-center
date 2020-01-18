package easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
	public static void main(String[] args) {
		int inputArray[] = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 };
		int referenceArray[] = { 2, 1, 4, 3, 9, 6 };
		System.out.println(Arrays.toString(relativeSortArray(inputArray, referenceArray)));
	}

	private static int[] relativeSortArray(int[] inputArray, int[] referenceArray) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> indexMap = new HashMap<>();
		for (int i = 0; i < referenceArray.length; i++) {
			indexMap.put(referenceArray[i], i);
		}
		for (int i = 0; i < inputArray.length-1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (indexMap.containsKey(inputArray[j - 1]) && indexMap.containsKey(inputArray[j])
						&& indexMap.get(inputArray[j - 1]) > indexMap.get(inputArray[j])) {
					int temp = inputArray[j - 1];
					inputArray[j - 1] = inputArray[j];
					inputArray[j] = temp;
				} else if (indexMap.containsKey(inputArray[j]) && !indexMap.containsKey(inputArray[j - 1])) {
					int temp = inputArray[j - 1];
					inputArray[j - 1] = inputArray[j];
					inputArray[j] = temp;
				} else if (inputArray[j - 1] > inputArray[j] && !indexMap.containsKey(inputArray[j - 1])
						&& !indexMap.containsKey(inputArray[j])) {
					int temp = inputArray[j - 1];
					inputArray[j - 1] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}

		return inputArray;

	}

}
