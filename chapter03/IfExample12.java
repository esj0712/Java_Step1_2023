package chapter03;

import java.util.Scanner;

public class IfExample12 {

	public static void main(String[] args) {
		
		String ID="soldesk";
		int PW=221227;
		
		//Scanner scan
		Scanner scan=new Scanner(System.in);
	    //ID 
		System.out.println(" ");
		String inputID=scan.nextLine();
		
	    if(ID.equals(inputID)) {
	    	
	    	System.out.println(" : ");
	    	String inputPW=scan.nextLine();
	    	
	        if(PW == Integer.parseInt(inputPW)) {
	        	System.out.println("");
	        }else {
	        	System.out.println("");
	        }
	    }else {
	    	System.out.println("");
	        }
	    
	    }//main
	}//class


