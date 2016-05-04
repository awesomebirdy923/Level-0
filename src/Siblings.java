import javax.swing.JOptionPane;

public class Siblings {
public static void main(String[] args){
	String one = JOptionPane.showInputDialog("how many siblings do you have?");
	int two = Integer.parseInt(one);
	if(two > 2){
	String three = JOptionPane.showInputDialog("what position in the family are you at?");
	int four = Integer.parseInt(three);
	if(four <= 3){
		JOptionPane.showMessageDialog(null, "OLLOLOLOOLOLOLOLOl, get a life");
	} else{
		JOptionPane.showMessageDialog(null, "LOLOLOLOLLOLOLOLOL, loser");
	}
	}else{
		JOptionPane.showMessageDialog(null, "LOLOLOLOLOLOLOLOLOLOLOLOLOOOLLOOOL, ha!");
	}
}	
}
