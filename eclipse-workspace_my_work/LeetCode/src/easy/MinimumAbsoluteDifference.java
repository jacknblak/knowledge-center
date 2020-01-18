package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
	public static void main(String[] args) {
		int inputNumbers [] = {3,8,-10,23,19,-4,-14,27};
	}

	private static List<List<Integer>> minAbsDifferencePair(int[] inputNumbers) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(inputNumbers);
		int minDifference = Integer.MAX_VALUE ;
		for(int i = 0 ; i <inputNumbers.length-1;i++) {
			minDifference = Math.min(minDifference, Math.abs(inputNumbers[i]-inputNumbers[i+1]));
		}
		for(int i = 0 ; i <inputNumbers.length-1;i++) {
			if(Math.abs(inputNumbers[i] - inputNumbers[i+1]) == minDifference) {
				List<Integer> temp = new ArrayList<Integer>();
				temp.add(inputNumbers[i]);
				temp.add(inputNumbers[i+1]);
				result.add(temp);
			}
		}
		
		
		return result;
	}

}
