package chapter03;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("(F/M)");
		char gender;
		gender=scan.nextLine().charAt(0);
		
		if(gender == 'M') {
			System.out.println("");
		}else {
			System.out.println("");
		}

		
		System.out.println("------------------------");
		System.out.println();
		System.out.println(" (Y/N)");
		
		char ch;
		ch=scan.nextLine().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			System.out.println("");
		}else {
			System.out.println("");
		}
		
		
		System.out.println("------------------------");
		System.out.println();
		System.out.println(" : ");
		
		char fo;
		fo=scan.nextLine().charAt(0);
		
		if(fo == 'D' || fo == 'd' ) {
			System.out.println("");
		}else if(fo == 'S' || fo == 's') {
			System.out.println("");
		}
		System.out.println();
		System.out.println(".");
	}

}
