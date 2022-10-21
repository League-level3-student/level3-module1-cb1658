package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Add name");
	JButton button2 = new JButton("View names");
	JPanel panel = new JPanel();
	
	
	public static void main(String[] args) {
		
		_02_GuestBook gb = new _02_GuestBook();
		gb.run();
	
	
	}

	private void run() {

		
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String input = JOptionPane.showInputDialog("Please enter in your new name: ");
			System.out.print(input);
			names.add(input);
		}
		if(e.getSource() == button2) {
			int index = 0;
			for(String a : names) {
				index++;
				JOptionPane.showMessageDialog(null, "Guest #"+index+": " + a);
			}
		}
	}
}
