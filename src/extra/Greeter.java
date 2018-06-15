package extra;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String N=JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Hello "+N);
	
}
}
