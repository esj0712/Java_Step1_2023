package chapter03;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		
		
		String ID = "soldesk"; 
		int PW = 221227; 

		
		String id = JOptionPane.showInputDialog("");
		int pass = Integer.parseInt(JOptionPane.showInputDialog(""));

		if (ID.equals(id)) {
			
			if (PW == pass) {
				System.out.println(ID + "");
			} else {
				System.out.println(".");
			}
		} else {
			System.out.println("");
		}

	}//main

}//class
