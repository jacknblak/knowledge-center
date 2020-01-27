package contest;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
	
	public static int solution(int [] A) {
		int result = 0 ;
		Set<Integer> storageSet = new HashSet<Integer>();
		for(int i : A) {
			storageSet.add(i);
		}
		
		for(int i = 0 ; i < A.length;i++) {
			int sum = 0;
			for(int j = i+1; j<A.length;j++) {
				sum = A[i]+A[j];
				if(storageSet.contains(0-sum)) {
					result++;
				}
			}
			storageSet.remove(A[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int A[] = {-2,2,3,0,4,-7};
		System.out.println(solution(A));
	}

}
