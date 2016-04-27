import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class TortioseWOF {
public static void main(String[] args) {
	
	Tortoise.show();
	
	Tortoise.setSpeed(10);
	Tortoise.penDown();
	for (int i = 0; i < 5; i++) {
		Tortoise.turn(144);
		Tortoise.move(120);
	}
	
	// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to see the result of this line.
	
	// 2. Make the Tortoise draw a star shape. Hint: 144.

	// 3. Set the size of the star to 30.

	/** THE CHALLENGE: **/
	/*
	 * Make the Tortoise draw a line of stars like this:
	 * http://bit.ly/walk-of-fame
	 * 
	 * Hint: The distance between stars is 50.
	 */

	
}
}
