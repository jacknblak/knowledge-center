package java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachHowToDoItInJava {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		integerList.forEach((a) -> System.out.println(a));
	}

}
