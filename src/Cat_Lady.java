
import java.net.URI;

import javax.swing.JOptionPane;

public class Cat_Lady {

	public static void main(String[] args) {
		String q = JOptionPane.showInputDialog("How many catz do you have?");
		int a = Integer.parseInt(q);

		if (a > 3) {
			JOptionPane.showMessageDialog(null, "Your a crazy cat lady!");
		}
		else if (a == 0) {
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
			else if (a <= 3) {
				
				playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
				
		} else {

			//q = JOptionPane.showInputDialog("How many catz do you have?");

		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
