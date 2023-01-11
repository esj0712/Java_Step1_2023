package chapter03.FOR.While;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Java ");
			int scr = scan.nextInt();
			
			//
			
			if(scr < 0 || scr<100) {
				System.out.println("");
				break;
			}			
			if(scr >= 60) {
				System.out.println("");
			}else {
				System.out.println("");
			}			
		}
	    System.out.println("");
	}
}
