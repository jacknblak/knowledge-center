package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SelfDividingNumbers {
	public static void main(String[] args) {
		int left = 21; 
		int right = 22;
		System.out.println(Arrays.toString(selfDividingNumber(left,right).toArray()));
	}

	private static List<Integer> selfDividingNumber(int left,int right) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<Integer>();
		for(int i = left ; i <= right ; i ++) {
			if(checkIfSelfDividing(i)){
				result.add(i);
			}
		}
		return result;
	}

	private static boolean checkIfSelfDividing(int number) {
		// TODO Auto-generated method stub
		//boolean selfDividing = true;
		int originalNumber = number;
		for(int i = 0 ; i < String.valueOf(originalNumber).length();i++) {
			int temp = number%10;
			if(temp == 0 || originalNumber % temp != 0) {
				return false;
			}
			number = number /10;
			
		}
		return true;
		
	}

}
