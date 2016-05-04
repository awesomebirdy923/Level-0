import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++){
			int r = new Random().nextInt(49)+1;
			System.out.println(r);
		}
	}
	
}
