import javax.swing.JOptionPane;

public class Banana_Quaz {

	static String input = JOptionPane.showInputDialog("Do u like BANANAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZZZ");

	
	public static void main(String[] args) {
		if(input.equalsIgnoreCase("Yes")){
			String q = JOptionPane.showInputDialog("What do u like?");
			JOptionPane.showMessageDialog(null, q + " is way better than bananas");
		}
		else{
			JOptionPane.showMessageDialog(null, "WHY U NO LKIE BANANAZZ");
			System.exit(0);
		}
	}
	
}
