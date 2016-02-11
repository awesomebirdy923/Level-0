import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
public static void main(String[] args) {
	int random = new Random().nextInt(5);
	
	System.out.println(random);
	for(int i = 0; i <= 1000; i++){
		random = new Random().nextInt(5);
	if(random == 0){
		JOptionPane.showMessageDialog(null, "your cool!");
	}
	if(random == 1){
		JOptionPane.showMessageDialog(null, "your fun!");
	}
	if(random == 2){
		JOptionPane.showMessageDialog(null, "your clean!");
	}
	if(random == 3){
		JOptionPane.showMessageDialog(null, "your amazin!");
	}
	if(random == 4){
		JOptionPane.showMessageDialog(null, "your smart!");
	}
	}
}
}
