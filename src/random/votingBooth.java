package random;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	int good = Integer.parseInt(age);
	if(good>=18) {
		JOptionPane.showInputDialog("Good. Who do you want for President?");
		JOptionPane.showMessageDialog(null, "Great!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Get out of here kid, nobody cares about your opinion!");
	}
}
}
