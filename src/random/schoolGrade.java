package random;

import javax.swing.JOptionPane;

public class schoolGrade {
public static void main(String[] args) {
String grade =	JOptionPane.showInputDialog("What grade did you get on your last test?");
int performance =	Integer.parseInt(grade);
if(performance>=70) {
	JOptionPane.showMessageDialog(null, "Congradulations, you passed!");
}
else {
	JOptionPane.showMessageDialog(null, "Boy you dumb!!");
}
}
}
