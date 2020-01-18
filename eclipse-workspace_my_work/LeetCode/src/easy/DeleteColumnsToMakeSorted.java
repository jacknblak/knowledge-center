package easy;

public class DeleteColumnsToMakeSorted {
	public static void main(String[] args) {
		String inputArray[] = {"abcdef","uvwxyz"};
		System.out.println(minDeletionSize(inputArray));
	}

	private static int minDeletionSize(String[] inputArray) {
		// TODO Auto-generated method stub
		int lengthToDelete = 0 ;
		for(int i = 0 ; i <inputArray[0].length();i ++) {
			int temp = inputArray[0].charAt(i) ;
			for(int j = 1 ; j <inputArray.length; j++) {
				 
				if(inputArray[j].charAt(i) < temp) {
					lengthToDelete++;
					break;
				}else {
					temp = inputArray[j].charAt(i);
				}
			}
		}
		return lengthToDelete;
	}

}
