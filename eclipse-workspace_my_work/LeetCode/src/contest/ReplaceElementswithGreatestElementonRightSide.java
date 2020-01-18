package contest;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceElementswithGreatestElementonRightSide {
	
	public static void main(String[] args) {
		int inputArray[] = {17,18,5,4,6,1};
		System.out.println(Arrays.toString(replaceElements(inputArray)));
	}
	
	
	public static int [] replaceElements(int [] inputArray) {
		int result[] = new int [inputArray.length];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);
		for(int i = inputArray.length-1 ; i >0 ; i-- ) {
			if(inputArray[i] > stack.peek()) {
				stack.push(inputArray[i]);
			}else {
				stack.push(stack.peek());
			}
		}
		for(int i = 0 ; i < inputArray.length;i++) {
			result[i] = stack.pop();
		}
		return result;
	}

}
