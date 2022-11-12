package _06_Intro_To_Hash_Maps;

import java.util.HashMap;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("Veiw List");
	JButton button4 = new JButton("Remove Entry");
	
	public static void main(String[] args) {
		_02_LogSearch charlie = new _02_LogSearch();
		charlie.run();
	}
	private void run() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent action) {
		if(action.getSource() == button1) {
			String input1 = JOptionPane.showInputDialog("Please enter in your ID number: ");
			String input2 = JOptionPane.showInputDialog("Please enter in your name: ");
			int input1Int = Integer.parseInt(input1);
			hm.put(input1Int, input2);
		}
		
		if(action.getSource() == button2) {
			String input = JOptionPane.showInputDialog("Please enter in your ID number : ");
			int input3Int = Integer.parseInt(input);
			if(hm.get(input3Int) != null) {
				System.out.println("The name is: "+hm.get(input3Int));
			}
			else {
				System.out.println("Sorry, that ID does not exist yet");
			}
		}
		
		if(action.getSource() == button3){
			for(Integer s : hm.keySet()) {
				System.out.println("ID: "+s+" Name: " + hm.get(s));
			}
		}
		
		if(action.getSource() == button4) {
			String input = JOptionPane.showInputDialog("Please enter in your ID number : ");
			int input3Int = Integer.parseInt(input);
			if(hm.get(input3Int) != null) {
				hm.remove(input3Int);
			}
			else {
				System.out.println("That ID does not exist.");
			}
		}
		
	}
}		

	
	
	
	/*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with four buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */
	


