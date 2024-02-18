package bro;

import javax.swing.JOptionPane;

public class GUI_Conversation {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("what is your name....?");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!!!!!!");

		int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age....?"));
		JOptionPane.showMessageDialog(null, "soooo you are " + age + " years old !!!!!!");

		double height = Double.parseDouble(JOptionPane.showInputDialog("your Height"));
		JOptionPane.showMessageDialog(null, "Hmmmm you are " + height + " feets tall !!!!!!");

	}

}
