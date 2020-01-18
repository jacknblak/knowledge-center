package easy;

public class RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {
		String inputString = "abbaca";
		System.out.println(removeDuplicates(inputString));
	}

	private static String removeDuplicates(String inputString) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder(inputString);
		boolean dublicateFind = true;
		for (int i = 0; i < builder.length() - 1;) {
			while (i < builder.length() - 1 && builder.charAt(i) == builder.charAt(i + 1)) {
				builder.deleteCharAt(i);
				builder.deleteCharAt(i);
				if(i !=0) {
					i--;
				}
			}
			i++;
		}
		return builder.toString();

	}

}
