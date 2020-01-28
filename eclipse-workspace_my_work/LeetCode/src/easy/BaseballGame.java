package easy;

import java.util.Stack;

public class BaseballGame {
	/*
	 * You're now a baseball game point recorder.
	 * 
	 * Given a list of strings, each string can be one of the 4 following types:
	 * 
	 * Integer (one round's score): Directly represents the number of points you get
	 * in this round. "+" (one round's score): Represents that the points you get in
	 * this round are the sum of the last two valid round's points. "D" (one round's
	 * score): Represents that the points you get in this round are the doubled data
	 * of the last valid round's points. "C" (an operation, which isn't a round's
	 * score): Represents the last valid round's points you get were invalid and
	 * should be removed. Each round's operation is permanent and could have an
	 * impact on the round before and the round after.
	 * 
	 * You need to return the sum of the points you could get in all the rounds.
	 * 
	 * Example 1: Input: ["5","2","C","D","+"] Output: 30 Explanation: Round 1: You
	 * could get 5 points. The sum is: 5. Round 2: You could get 2 points. The sum
	 * is: 7. Operation 1: The round 2's data was invalid. The sum is: 5. Round 3:
	 * You could get 10 points (the round 2's data has been removed). The sum is:
	 * 15. Round 4: You could get 5 + 10 = 15 points. The sum is: 30. Example 2:
	 * Input: ["5","-2","4","C","D","9","+","+"] Output: 27 Explanation: Round 1:
	 * You could get 5 points. The sum is: 5. Round 2: You could get -2 points. The
	 * sum is: 3. Round 3: You could get 4 points. The sum is: 7. Operation 1: The
	 * round 3's data is invalid. The sum is: 3. Round 4: You could get -4 points
	 * (the round 3's data has been removed). The sum is: -1. Round 5: You could get
	 * 9 points. The sum is: 8. Round 6: You could get -4 + 9 = 5 points. The sum is
	 * 13. Round 7: You could get 9 + 5 = 14 points. The sum is 27.
	 */
	
	public static void main(String[] args) {
		String [] inputRounds = {"5","2","C","D","+"};
		System.out.println("Get total score : "+getScore(inputRounds));
	}

	private static int getScore(String[] inputRounds) {
		// TODO Auto-generated method stub
		Stack<Integer> numbers = new Stack<Integer>(); 
		int result = 0 ; 
		for(int index = 0 ; index < inputRounds.length; index++) {
			try {
				int tempScore = Integer.parseInt(inputRounds[index]);
				result += tempScore;
				numbers.push(tempScore);
			}catch (NumberFormatException exception) {
				if(inputRounds[index].equals("+")) {
					int tempFirst = numbers.pop();
					int tempSecond = numbers.peek();
					numbers.push(tempFirst);
					numbers.push(tempFirst+tempSecond);
					result +=tempFirst+tempSecond;
				}
				if("D".equals(inputRounds[index])) {
					int tempDouble = numbers.peek()*2;
					result += numbers.peek()*2;
					numbers.push(tempDouble);
					
				}
				if("C".equals(inputRounds[index])) {
					result -= numbers.pop();
				}
				
			}
			
		}
		return result;
	}

}
