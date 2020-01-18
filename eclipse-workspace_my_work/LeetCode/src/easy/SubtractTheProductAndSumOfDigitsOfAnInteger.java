package easy;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
	public static void main(String[] args) {
		int number = 234;
		System.out.println("Output is : ");
		System.out.println(substractProductAndSum(number));
	}

	private static int substractProductAndSum(int number) {
		// TODO Auto-generated method stub
		int product = 1;
		int sum = 0;
		int mod = 10;
		int length = String.valueOf(number).length();
		for(int i = 0 ; i< length;i++) {
			int temp = number%mod;
			product = product*temp;
			number = number /10;
			sum = sum + temp;
		}
		return product - sum;
	}

}
