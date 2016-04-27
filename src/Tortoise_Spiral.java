import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Tortoise_Spiral {

	public static void main(String[] args) {
		String in = JOptionPane.showInputDialog("");
		String color = JOptionPane.showInputDialog("");
		int sides = Integer.parseInt(in);
		if (color.equals("red") || color.equals("Red")) {
			Tortoise.setPenColor(Color.red);
		}
		if (color.equals("green") || color.equals("Green")) {
			Tortoise.setPenColor(Color.green);
		}
		if (color.equals("blue") || color.equals("Blue")) {
			Tortoise.setPenColor(Color.blue);
		} else{
			Tortoise.setPenColor(Color.red);
		}
		Tortoise.setSpeed(10);
		for (int i = 0; i < 10000; i++) {
			Tortoise.turn(360 / sides);
			Tortoise.move(2 * i);
		}
	}

}
