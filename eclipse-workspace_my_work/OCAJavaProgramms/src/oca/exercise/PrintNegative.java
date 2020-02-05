package oca.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrintNegative {
	
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(1);
		number.add(-5);
		number.add(0);
		print(number,e -> e <0);
		
	}
	public static void print(List<Integer> list,Predicate<Integer> p) {
		for(Integer val : list) {
			if(p.test(val))
			System.out.println(val);
		}
	}

}
