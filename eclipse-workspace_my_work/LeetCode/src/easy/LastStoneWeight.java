package easy;

import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
	public static void main(String[] args) {
		/*
		 * We have a collection of rocks, each rock has a positive integer weight.
		 * 
		 * Each turn, we choose the two heaviest rocks and smash them together. Suppose
		 * the stones have weights x and y with x <= y. The result of this smash is:
		 * 
		 * If x == y, both stones are totally destroyed; If x != y, the stone of weight
		 * x is totally destroyed, and the stone of weight y has new weight y-x. At the
		 * end, there is at most 1 stone left. Return the weight of this stone (or 0 if
		 * there are no stones left.)
		 * 
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so
		 * the array converts to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the
		 * array converts to [2,1,1,1] then, we combine 2 and 1 to get 1 so the array
		 * converts to [1,1,1] then, we combine 1 and 1 to get 0 so the array converts
		 * to [1] then that's the value of last stone.
		 */
		int intputStone[] = {2,7,4,1,8,1};
		System.out.println("Weight of last stone is : " +getWeightOfLastStone(intputStone));
		
	}

	private static int getWeightOfLastStone(int[] intputStone) {
		// TODO Auto-generated method stub
		/*
		 * Putting everything in priority queue with reverse sorted as max elements are on top ; 
		 */
		int lastStoneWeight = 0;
		Queue< Integer> stoneStorage = new PriorityQueue<Integer>((a, b) -> b - a);
		for(int i = 0 ; i < intputStone.length;i++) {
			stoneStorage.add(intputStone[i]);
		}
		
		while(stoneStorage.size() > 1) {
			stoneStorage.add(stoneStorage.poll()-stoneStorage.poll());
		}
		return stoneStorage.poll();
	}

}
