package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HeightChecker {
	public static void main(String[] args) {
		int intputArray[] = {1,1,4,2,1,3};
		System.out.println(heightChecker(intputArray));
	}

	private static int heightChecker(int[] intputArray) {
		// TODO Auto-generated method stub
		int tempArray[] = Arrays.copyOf(intputArray, intputArray.length);
		
		Arrays.parallelSort(tempArray);
		int result = 0 ; 
		//Set<Integer> result = new HashSet<>();
		for(int i = 0 ; i <intputArray.length; i ++) {
			if(intputArray[i] != tempArray[i]) {
				result++;
			}
		}
		return result;
	}

}
