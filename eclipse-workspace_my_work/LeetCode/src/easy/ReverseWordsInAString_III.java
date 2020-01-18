package easy;

import java.util.Arrays;

public class ReverseWordsInAString_III {
	
	public static void main(String[] args) {
		String inputString = "Let's take LeetCode contest";
		System.out.println(reverseWords(inputString));
		
	}

	private static String reverseWords(String inputString) {
		// TODO Auto-generated method stub
		char []charArray = inputString.toCharArray();
		int start = 0 ;
		int end =  0 ;
		//int stringStart = 0 ;
		for(int i = 0 ; i < charArray.length; i ++) {
			while(i< charArray.length && charArray[i] != ' ') {
				i++;
			}
			end = i-1;
			
			while(start < end) {
				char tempChar = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = tempChar;
				start++;
				end--;
			}
			i = i +1;
			start = i;
			end = i;
		}
		
		
		return new String(charArray);
	}

}
