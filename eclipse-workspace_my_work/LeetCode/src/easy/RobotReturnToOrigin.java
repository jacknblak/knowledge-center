package easy;

public class RobotReturnToOrigin {
	public static void main(String[] args) {
		String robotDirection = "UU";
		System.out.println(judjeCricle(robotDirection));
	}

	private static boolean judjeCricle(String robotDirection) {
		// TODO Auto-generated method stub
		int horizontal  = 0 ;
		int vertical = 0 ;
		for(int i = 0 ; i < robotDirection.length(); i ++) {
			if(robotDirection.charAt(i) == 'U') {
				vertical++;
			}
			if(robotDirection.charAt(i) == 'D') {
				vertical--;
			}
			if(robotDirection.charAt(i) == 'R') {
				horizontal++;
			}
			if(robotDirection.charAt(i) == 'L') {
				horizontal--;
			}
		}
		
		return (horizontal == 0) && (vertical == 0);
	}

}
