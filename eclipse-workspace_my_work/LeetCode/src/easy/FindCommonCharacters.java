package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {
	public static void main(String[] args) {
		String inputString [] = {"bella","label","roller"};
		System.out.println(Arrays.toString(commonChars(inputString).toArray()));
	}

	private static List<String> commonChars(String[] inputString) {
		// TODO Auto-generated method stub
		int minFrequencyCounter[] = new int [26];
		Arrays.fill(minFrequencyCounter, Integer.MAX_VALUE);

		for(int i = 0 ; i < inputString.length;i++) {
			int charArray [] = new int [26];
			for(char ch : inputString[i].toCharArray()) {
				charArray[ch - 'a']++;
			}
			for(int j = 0 ; j < 26 ; j ++) {
				minFrequencyCounter[j] = Math.min(charArray[j], minFrequencyCounter[j]);
			}
		}
		List<String> result = new ArrayList<String>();
		for(int i = 0 ; i < 26;i ++) {
			while(minFrequencyCounter[i] !=0) {
				result.add(""+(char) (i+'a'));
				minFrequencyCounter[i]--;
			}
		}
		return result;
	}

}
