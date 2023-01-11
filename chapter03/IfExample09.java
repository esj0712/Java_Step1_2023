package chapter03;

import javax.swing.JOptionPane;

public class IfExample09 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog(" 2"));

		
		
		if(num1>num2) {
			System.out.println("num1 ");
	    }else if(num2>num1) {
			System.out.println("num2");
	    }else {
	    	System.out.println("");
	    }
		
	}

}
