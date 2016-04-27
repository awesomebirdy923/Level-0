import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args){
		boolean isPrime = true;
		String input = JOptionPane.showInputDialog("CHOOSE A NUMBER");
		int in = Integer.parseInt(input);
		for (int i = 2; i < in; i++) {
			if(in % i == 0){
				isPrime = false;
			}
		} if(!isPrime){
			System.out.println(in + " is not prime");
		} else{
			System.out.println(in + " is prime");
		}
	}
	
}
