package random;

import javax.swing.JOptionPane;

public class rollerCoaster {
public static void main(String[] args) {
String Tallness =	JOptionPane.showInputDialog("How tall are you?");
int height =Integer.parseInt(Tallness);
if(height>= 48) {
	JOptionPane.showMessageDialog(null, "Congradulations. You can ride.");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry kid, get lost.");
}
}
}
