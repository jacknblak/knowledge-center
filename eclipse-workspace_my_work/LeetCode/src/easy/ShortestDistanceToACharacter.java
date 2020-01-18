package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShortestDistanceToACharacter {
	public static void main(String[] args) {
		String inputString = "loveleetcode";
		char c = 'e';
		/*
		 * Input: S = "loveleetcode", C = 'e' Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1,
		 * 0]
		 */
		System.out.println(Arrays.toString(shortestToChar(inputString, c)));
	}

	private static int[] shortestToChar(String inputString, char c) {
		// TODO Auto-generated method stub
		int result[] = new int [inputString.length()];
		int prev = -5000;
		for(int i = 0 ; i<inputString.length() ; i ++) {
			if(inputString.charAt(i) == c) {
				prev = i;
			}
			result[i] = i -prev;
		}
		prev = 5000;
		for(int i = inputString.length()-1; i >=0;i--) {
			if(inputString.charAt(i) == c) {
				prev =i;
			}
			result[i] = Math.min(result[i],prev-i);
		}
		return result;
		
	}

}
