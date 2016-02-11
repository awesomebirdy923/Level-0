import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Change_Calculator {

	static String dimes = JOptionPane.showInputDialog("How many dimes do you have?");

	static String quarters = JOptionPane.showInputDialog("How many quarters do you have?");

	static String nickels = JOptionPane.showInputDialog("How many nickels do you have?");

	static int dCount = Integer.parseInt(dimes);
	static int qCount = Integer.parseInt(quarters);
	static int nCount = Integer.parseInt(nickels);

	static double finalAmt = dCount * 10 + qCount * 25 + nCount * 5;

	
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, finalAmt);
		
	}

}
