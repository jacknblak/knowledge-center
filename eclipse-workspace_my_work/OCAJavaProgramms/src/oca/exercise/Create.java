package oca.exercise;

public class Create {
	
	public Create()
	{
		System.out.println("1");
	}
	public Create(int num)
	{
		System.out.println("2");
	}
	public Create(Integer num)
	{
		System.out.println("3");
	}
	public Create(int ...num)
	{
		System.out.println("4");
	}
	public Create(Object num)
	{
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		new Create(100);
		new Create(100L);
	}

}
