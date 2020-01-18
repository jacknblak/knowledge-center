package contest;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.omg.CORBA.FREE_MEM;

public class DivideArrayInSetsOfKConsecutiveNumbers {
	/*
	 * Given an array of integers nums and a positive integer k, find whether it's
	 * possible to divide this array into sets of k consecutive numbers Return True
	 * if its possible otherwise return False.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,3,4,4,5,6], k = 4 Output: true Explanation: Array can be
	 * divided into [1,2,3,4] and [3,4,5,6]. Example 2:
	 * 
	 * Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3 Output: true Explanation:
	 * Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11]. Example
	 * 3:
	 * 
	 * Input: nums = [3,3,2,2,1,1], k = 3 Output: true Example 4:
	 * 
	 * Input: nums = [1,2,3,4], k = 3 Output: false Explanation: Each array should
	 * be divided in subarrays of size 3.
	 */
	
	public static void main(String[] args) {
		int inputArray[] = {1,2,3,3,4,4,5,12};
		int k = 4;
		System.out.println(isPossibleDivide(inputArray,k));
	}

	private static boolean isPossibleDivide(int[] inputArray,int k) {
		// TODO Auto-generated method stub
		if(inputArray.length%k != 0) {
			return false;
		}
		TreeMap<Integer, Integer> incrementalCounter = new TreeMap<Integer, Integer>();
		for(int i = 0 ; i < inputArray.length;i++) {
			if(incrementalCounter.containsKey(inputArray[i])) {
				incrementalCounter.put(inputArray[i], incrementalCounter.get(inputArray[i])+1);
			}else {
				incrementalCounter.put(inputArray[i], 1);
			}
		}
		boolean posbileToDivide = true;
		while(!incrementalCounter.isEmpty()) {
			int counter = k;
			int tempValue = incrementalCounter.firstKey();
			if(incrementalCounter.get(tempValue) >1) {
				incrementalCounter.put(tempValue, incrementalCounter.get(tempValue)-1);
			}else {
				incrementalCounter.remove(tempValue);
			}
			tempValue++;
			while(counter-->1) {
				if(incrementalCounter.containsKey(tempValue)) {
					if(incrementalCounter.get(tempValue) >1) {
						incrementalCounter.put(tempValue, incrementalCounter.get(tempValue)-1);
					}else {
						incrementalCounter.remove(tempValue);
					}
				}else {
					return false;
				}
				tempValue++;
			}
		}
		
		return posbileToDivide;
	}

}
