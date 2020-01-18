package easy;

public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int inputArray[] = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(inputArray));
	}

	private static int peakIndexInMountainArray(int[] inputArray) {
		// TODO Auto-generated method stub
		int start = 0 ; 
		int end = inputArray.length -1 ;
		while(start <= end) {
			if(inputArray[start] > inputArray[end]) {
				end--;
			}else {
				start++;
			}
		}
		return end;
	}

}
