package easy;

import java.util.Random;

public class NRepeatedElementInSize2NArray {
	public static void main(String[] args) {
		int intputArray[] = {1,2,3,3};
		System.out.println(repeatedNTimes(intputArray));
	}

	private static int repeatedNTimes(int[] intputArray) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int i,j;
		while(intputArray[i = random.nextInt(intputArray.length)] != intputArray[j = random.nextInt(intputArray.length)] || i == j);
		return intputArray[i];
	}

}
