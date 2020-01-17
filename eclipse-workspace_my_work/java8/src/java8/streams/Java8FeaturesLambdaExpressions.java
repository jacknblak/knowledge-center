package java8.streams;

import interfaces.MatheMaticalOperations;

public class Java8FeaturesLambdaExpressions {

	/*
	 * This file is to demonstrate java 8 features with lambda expression
	 * 
	 * What are lambda expressions ? Why to use Lambda expressions ? When to use
	 * Lambda expressions ? How to use Lambda Expressions ?
	 */

	/*
	 * What are lambda expression ?
	 * 
	 * Lambda expressions are introduced in java 8. They are basic building block
	 * for functional programming.
	 * 
	 * With help of lambda expressions you can create methods which are not
	 * associated to any class and can be used whenever you want them.
	 * 
	 * Create them on the fly and and use them.
	 */

	/*
	 * Now we have created on functional interface let's use this.
	 */

	public static void main(String[] args) {
		Java8FeaturesLambdaExpressions java8FeaturesLambdaExpressions = new Java8FeaturesLambdaExpressions();

		/*
		 * Rather than creating a method named as addition we have created lambda
		 * expression which will do addition give two numbers in parameter
		 */

		/*
		 * This interface can be found on same git repo under interfaces package
		 */
		MatheMaticalOperations addition = (int a, int b) -> (a + b);

		/*
		 * Now we will create another method which will do subtraction given that two
		 * numbers
		 * 
		 */

		MatheMaticalOperations subtraction = (int a, int b) -> (a - b);

		System.out.println("Adding 3 and 4 : " + java8FeaturesLambdaExpressions.performOperation(3, 4, addition));
		System.out
				.println("Subtracting 5 and 4 : " + java8FeaturesLambdaExpressions.performOperation(3, 4, subtraction));

		/*
		 * Output of below code will be
		 * 
		 * Adding 3 and 4 : 7 Subtracting 5 and 4 : -1
		 */

	}

	/*
	 * Now we will create a utility method which which take mathematical operation
	 * and do desired task
	 */

	/**
	 * This method is to return result depending on mathematical operation provided
	 * 
	 * @param a
	 * @param b
	 * @param matheMaticalOperations
	 * @return
	 */
	private int performOperation(int a, int b, MatheMaticalOperations matheMaticalOperations) {
		return matheMaticalOperations.operations(a, b);
	}

}
