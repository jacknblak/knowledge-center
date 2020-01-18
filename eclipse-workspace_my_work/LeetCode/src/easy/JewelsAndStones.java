package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JewelsAndStones {
	public static void main(String[] args) {
		String jewel = "aA";
		String stone = "aAAbbbb";
		System.out.println("Number of jewels we have is ");
		System.out.println((numJewelsInStones(jewel,stone)));
	}

	private static Object numJewelsInStones(String jewel, String stone) {
		Set<Character> jewelSet= new HashSet<>();
		for(Character ch : jewel.toCharArray()) {
			jewelSet.add(ch);
		}
		int count = 0 ;
		for(Character character : stone.toCharArray()) {
			if(jewelSet.contains(character)) {
				count++;
			}
		}
		return count;
		
	}

}
