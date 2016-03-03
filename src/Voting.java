import javax.swing.JOptionPane;

public class Voting {

	public static void main(String[] args){
		
		String q = JOptionPane.showInputDialog("How old are you?");
		int a = Integer.parseInt(q);
		
		if(a < 18){
			
			JOptionPane.showMessageDialog(null, "You cant vote at "+a+" years old");
			
		} else if(a >= 18){
			
			JOptionPane.showMessageDialog(null, "Who are you voting for?");
			
		}
		
	}
	
}
