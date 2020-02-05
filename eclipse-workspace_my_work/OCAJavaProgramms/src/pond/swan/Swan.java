package pond.swan;

import pond.shore.Bird;

public class Swan extends Bird {
	public void swim() {
		floatInWater();
		System.out.println(text);
	}

	public void helpOtherSwanSwim() {
		Swan swan = new Swan();
		swan.floatInWater();
		System.out.println(swan.text);
	}

	public void helpOtherBirdSwim() {
		Bird bird = new Bird();
		// bird.floatInWater;
		// System.out.println(bird.text);

		/*
		 * A member is used without referring to a variable. This is the case on lines 5
		 * and 6. In this case, we are taking advantage of inheritance and protected
		 * access is allowed. ■ 
		 * A member is used through a variable. This is the case on
		 * lines 10, 11, 15, and 16. In this case, the rules for the reference type of
		 * the variable are what matter. If it is a subclass, protected access is
		 * allowed. This works for references to the same class or a subclass.
		 */
	}

}
