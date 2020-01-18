package contest;

import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero {
	public static void main(String[] args) {
		int arrayLength = 4;
		System.out.println(Arrays.toString(sumZero(arrayLength)));
	}

	private static int [] sumZero(int arrayLength) {
		// TODO Auto-generated method stub
		int result[] = new int [arrayLength];
		int counter =1;
		if(arrayLength %2 ==1) {
			result[0]  = 0;
			
			for(int i = 1 ; i<arrayLength;i++) {
				if(i%2==0) {
					result[i] = counter;
					counter++;
				}else {
					result[i] = -counter;
					
				}
			}
		}else {
			for(int i = 0 ; i<arrayLength;i++) {
				if(i%2==0) {
					result[i] = counter;
				}else {
					result[i] = -counter;
					counter++;
				}
			}
		}
		
		return result;
	}

}
