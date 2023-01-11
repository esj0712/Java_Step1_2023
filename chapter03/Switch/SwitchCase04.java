package chapter03.Switch;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		
		//charAT(0) : String => char
		
		Scanner scan=new Scanner(System.in);
		System.out.println("(A(a),B(b),C(c)) : ");
		
		char grade;
		String rank;
		
		
		grade=scan.nextLine().charAt(0);
		
		switch (grade) {
		case 'A': case 'a':
			rank ="";
			break;
		case 'B': case 'b':
			rank ="";
			break;

		default:
			rank ="";
			
		}//switch
            System.out.println(rank +"");
	}//main

}//class
