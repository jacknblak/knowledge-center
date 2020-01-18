package easy;

public class MinimumTimeVisitingAllPoints {
	public static void main(String[] args) {
		int arr[][]= {{1,1},{3,4},{-1,0}};
		System.out.println("Minimum seconds required to travel the given path");
		System.out.println(minTimeToVisitAllPoint(arr));
	}

	private static int minTimeToVisitAllPoint(int[][] arr) {
		// TODO Auto-generated method stub
		int result = 0 ; 
		int x = arr[0][0];
		int y = arr[0][1];
		for(int i = 1 ; i <arr.length;i++) {
			int x1 = arr[i][0];
			int y1 = arr[i][1];
			while( x != x1 || y != y1) {
				if(x < x1) {
					x++;
				}else if(x >x1) {
					x--;
					
				}
				if(y < y1) {
					y++;
				}else if(y > y1) {
					y--;
					
				}
				result++;
				
			}
		}
		return result;
	}
}
