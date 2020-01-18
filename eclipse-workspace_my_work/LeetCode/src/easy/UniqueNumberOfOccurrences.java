package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
	public static void main(String[] args) {
		int []inputArray = {4,2,2,1,1,3};
		System.out.println(uniqueOccurences(inputArray));
	}

	private static boolean uniqueOccurences(int[] inputArray) {
		// TODO Auto-generated method stub
		boolean unique = true; 
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		Set<Integer> uniqueCounter = new HashSet<Integer>();
		for(int i = 0 ; i < inputArray.length; i++) {
			frequencyMap.merge(inputArray[i], 1, Integer::sum);
		}
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if(uniqueCounter.contains(entry.getValue())) {
				return false;
			}else {
				uniqueCounter.add(entry.getValue());
			}
		}
		return true;
	}

}
