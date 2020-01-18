package easy;

public class SmallestRangeI {
	public static void main(String[] args) {
		int inputArray [] = {10};
		int k = 2;
		System.out.println(smallestRange(inputArray,k));
	}

	private static int smallestRange(int[] inputArray,int k) {
		// TODO Auto-generated method stub
		int smallesTNumber = Integer.MAX_VALUE;
		int largestNumber = Integer.MIN_VALUE;
		for(int i = 0 ; i < inputArray.length;i++) {
			smallesTNumber = Math.min(smallesTNumber, inputArray[i]);
			largestNumber = Math.max(largestNumber, inputArray[i]);
		}
		if((largestNumber-smallesTNumber) < 2*k) {
			return 0;
		}else {
			return (largestNumber-smallesTNumber) -2*k;
		}
	}

}
