package chapter03;

import javax.swing.JOptionPane;
             //GUI
public class IfExample02 {

	public static void main(String[] args) {
		// String => int : integer.parseInt
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog(""));
		
		
		if(dat % 10 == 0)
		    System.out.println(dat + "(");
		else
			System.out.println(dat + "(");

	}

}
