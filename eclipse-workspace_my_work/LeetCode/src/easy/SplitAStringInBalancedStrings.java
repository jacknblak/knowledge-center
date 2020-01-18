package easy;

public class SplitAStringInBalancedStrings {
	public static void main(String[] args) {
		String inputString = "RLLLLRRRLR";
		System.out.println(balancedStringSplit(inputString));
		
	}

	private static int balancedStringSplit(String inputString) {
		// TODO Auto-generated method stub
		int result = 0 ; 
		int counter = 0 ; 
		for(Character character : inputString.toCharArray()) {
			if(character == 'R') {
				counter++;
			}else if(character == 'L') {
				counter -- ; 
			}
			if(counter == 0) {
				result++;
			}
		}
		return result;
	}

}
