package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
	public static void main(String[] args) {
		String inputWords[] = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
		System.out.println(uniqueMorseRepresentations(inputWords));
	}

	private static int uniqueMorseRepresentations(String[] inputWords) {
		// TODO Auto-generated method stub
		Map<Character, String> morseCodeMap = new HashMap<Character, String>();
		String morseCode = ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..";
		String morseCodeArray [] = morseCode.split(",");
		int start = 'a';
		for(int i = 0 ; i <morseCodeArray.length;i++) {
			morseCodeMap.put((char)start, morseCodeArray[i]);
			start++;
		}
		Set<String> result = new HashSet<String>();
		for(int i = 0 ; i < inputWords.length;i ++) {
			String tempString = inputWords[i];
			StringBuilder stringBuilder = new StringBuilder();
			for(int j = 0 ;j < tempString.length();j++ ) {
				stringBuilder.append(morseCodeMap.get(tempString.charAt(j)));
			}
			result.add(stringBuilder.toString());
		}
		
		return result.size() ; 
	}

}
