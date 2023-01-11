package chapter03;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		
		
		int age;
	    int charge;
		
		
		age=Integer.parseInt(JOptionPane.showInputDialog(""));
		
		if(age>0 && age<8) {
		    charge=1000;
			System.out.println("");}
		else if(age>=8 && age<14) {
			charge=2000;
			System.out.println("");}
		else if(age>=14 && age<20) {
			charge=3500;
			System.out.println("");}
		 else {
			charge=5000;
			System.out.println("");}
		
	    System.out.println("" + charge + "");
			
		
		  
		//if
		

	}

}
