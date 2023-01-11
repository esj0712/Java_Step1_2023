package chapter03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample11 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		String ID=scan.nextLine(); 
		String PW=scan.nextLine();
		ID=("dd");
		PW=("1234");
		String id=JOptionPane.showInputDialog("");
		String pw=JOptionPane.showInputDialog("");
		
		
		//
		int pass=Integer.parseInt(pw);
	
		/*
		
	    if (ID.equals(id)) {
	    	if(PW==pw) 
	    		System.out.println("");
	    		}else if(PW!=pw) {
	    	        System.out.println("");
	    	    }if((ID!=id)||(PW!=pw)) {
	    	    	System.out.println("");
	    */
		
		
		if(ID.equals("sooldesk")&& pass==12345) {
				System.out.println("");
		}else {
			System.out.println("");
		}
		
		
	
	

	    }
	}

