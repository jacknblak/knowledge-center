package easy;

import java.util.Arrays;

public class SortArrayByParity {
	public static void main(String[] args) {
		int intputArray[] = {3,1,2,4};
		intputArray = sortArrayByParity(intputArray);
		System.out.println(Arrays.toString(intputArray));
	}

	private static int[] sortArrayByParity(int[] intputArray) {
		// TODO Auto-generated method stub
		int start = 0 ; 
		int end = intputArray.length-1;
		
		while(start < end) {
			while(intputArray[start]%2 == 0 && start <end) {
				start ++;
			}
			while(intputArray[end]%2 == 1 && start < end) {
				end--;
			}
			int temp = intputArray[start];
			intputArray[start] = intputArray[end];
			intputArray[end] = temp;
			start++;
			end--;
		}
		return intputArray;
		
		
	}

}
