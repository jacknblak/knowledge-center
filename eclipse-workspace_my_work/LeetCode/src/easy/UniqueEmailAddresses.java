package easy;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
	public static void main(String[] args) {
		String inputStringArray[] = {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
		System.out.println(getMinNumUniqueEmails(inputStringArray));
	}

	private static int getMinNumUniqueEmails(String[] inputStringArray) {
		// TODO Auto-generated method stub
		Set<String> result = new HashSet<String>();
		for(String string : inputStringArray) {
			StringBuilder stringBuilder = new StringBuilder();
			int index = 0 ; 
			while(index<string.length()) {
				if(string.charAt(index) == '.') {
					index++;
				}
				if(string.charAt(index) == '+') {
					while(index < string.length() && string.charAt(index) != '@' ) {
						index++;
					}
					stringBuilder.append(string.charAt(index++));
					break;
				}
				if(string.charAt(index) == '@') {
					stringBuilder.append(string.charAt(index++));
					break;
				}
				stringBuilder.append(string.charAt(index++));
			}
			while(index < string.length()) {
				stringBuilder.append(string.charAt(index++));
			}
			result.add(stringBuilder.toString());
		}
		return result.size();
	}

}
