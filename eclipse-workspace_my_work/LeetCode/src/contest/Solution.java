package contest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static  String[] solution(int N,int K) {
		if(N ==0) {
			return new String[] {""};
		}
		ArrayList<String> result = new ArrayList<String>();
		for(String p : solution(N-1,K-1)) {
			for(char l : new char [] {'a','b','c'}) {
				int pLen = p.length();
				if (pLen == 0 || p.charAt(pLen - 1) != l) {
                    result.add(p + l);
                }
			}
		}
		int prefSize = Math.min(result.size(), Math.max(K,0));
        return result.subList(0, ).toArray(new String[prefSize]);
	}
	public static void main(String[] args) {
		for(String s : solution(5, 2)) {
			System.out.print(s+" ");
		}
	}

}
