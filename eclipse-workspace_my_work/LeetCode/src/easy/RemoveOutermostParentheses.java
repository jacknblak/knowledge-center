package easy;

public class RemoveOutermostParentheses {
	public static void main(String[] args) {
		String inputString = "()()";
		System.out.println(removeOuterParentheses(inputString));
	}

	private static String removeOuterParentheses(String inputString) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder(inputString);
		int startIndex = 0 ; 
		int counter = 0 ; 
		for(int i = 0 ; i < builder.length(); i ++) {
			if(builder.charAt(i) == '(') {
				counter++;
			}else if(builder.charAt(i) == ')') {
				counter -- ; 
			}
			if(counter == 0) {
				builder.deleteCharAt(startIndex);
				builder.deleteCharAt(i-1);
				startIndex = i-1;
				i = i -2;
			}
		}
		return builder.toString();
	}

}
