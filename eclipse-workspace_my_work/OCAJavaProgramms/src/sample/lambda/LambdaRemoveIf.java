package sample.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaRemoveIf {
	
	public static void main(String[] args) {
		List<String> bunnies =new ArrayList<>();
		bunnies.add("floppy");
		bunnies.add("hoppy");
		bunnies.add("long ear");
		System.out.println(bunnies);
		bunnies.removeIf(s->s.charAt(0)!='h');
		System.out.println(bunnies);
		 
	}

}
