package easy;

import java.util.Arrays;

public class DIStringMatch {
	public static void main(String[] args) {
		String inputString = "III";
		System.out.println(Arrays.toString(diStringMatch(inputString)));
	}

	private static int[] diStringMatch(String inputString) {
		int low = 0 ; 
		int high = inputString.length();
		int result[] = new int[inputString.length()+1];
		for(int i = 0;i<inputString.length();++i) {
			if(inputString.charAt(i) == 'I') {
				result[i] = low++;
			}else {
				result[i] = high--;
			}
		}
		result[inputString.length()] = low;
		return result;
	}

}
