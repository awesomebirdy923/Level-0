import javax.swing.JOptionPane;

public class Practice_1 {

	public static void main(String[] args){
	
	String input = JOptionPane.showInputDialog("What grade did you get?");
	
	int output = Integer.parseInt(input);
	
	if(output >= 40){
		JOptionPane.showMessageDialog(null,"Good job!");
	}
	else if(output < 40 && output != 10){
		JOptionPane.showMessageDialog(null,"wow how can anyone have such a bad grade!");
	}
	
	else{
		
		JOptionPane.showMessageDialog(null, "great job at failing");
		
	}
	
	}
	
	
}
