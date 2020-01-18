package contest;

public class DecryptStringfromAlphabettoIntegerMapping {
	public static void main(String[] args) {
		/*
		 * Given a string s formed by digits ('0' - '9') and '#' . We want to map s to
		 * English lowercase characters as follows:
		 * 
		 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
		 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
		 * Return the string formed after mapping.
		 * 
		 * It's guaranteed that a unique mapping will always exist.
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: s = "10#11#12" Output: "jkab" Explanation: "j" -> "10#" , "k" -> "11#"
		 * , "a" -> "1" , "b" -> "2". Example 2:
		 * 
		 * Input: s = "1326#" Output: "acz" Example 3:
		 * 
		 * Input: s = "25#" Output: "y" Example 4:
		 * 
		 * Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
		 * Output: "abcdefghijklmnopqrstuvwxyz"
		 */
		String inputString = "10#11#12";
		System.out.println(decryptString(inputString));
	}

	private static String decryptString(String inputString) {
		StringBuilder result = new StringBuilder();
		int endIndex = inputString.length() -1;
		boolean hasFound = true;
		while(endIndex>=0) {
			if(inputString.charAt(endIndex) != '#') {
				int temp = Integer.valueOf(String.valueOf(inputString.charAt(endIndex))) -1;
				char tempChar = (char) ((char)temp + 'a');
				result.insert(0, tempChar);
				hasFound = false;
			}else if(inputString.charAt(endIndex) == '#') {
				StringBuilder temp = new StringBuilder();
				temp.insert(0, inputString.charAt(endIndex-1));
				temp.insert(0, inputString.charAt(endIndex-2));
				int tempInt = Integer.valueOf(temp.toString()) -1;
				char tempchar = (char) ((char)tempInt + 'a');
				result.insert(0, tempchar);
				hasFound = true;
			}
			if(hasFound) {
				endIndex = endIndex -3;
			}else {
				endIndex = endIndex -1;
			}
		}
		
		return result.toString();
	}

}
