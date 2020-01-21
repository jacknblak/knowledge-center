package java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodAsReference {
	
	/*
	 * We will try to pass method as reference
	 */
	
	public static void main(String[] args) {
		
		List<Integer> inputList =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		/*
		 * In below call println is directly called from System class out reference
		 */
		inputList.forEach(System.out::println);
	}

}
