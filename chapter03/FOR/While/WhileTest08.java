package chapter03.FOR.While;

import java.util.Scanner;



public class WhileTest08 {

	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
		
		int num;
		String menu = "";
		
		while(true) {
			System.out.print("1.");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:{
				System.out.println(".");
				break;}
			case 2:{
				System.out.println("");
				break;}
			case 3:{
				System.out.println("");
				break;}
			case 4:{
				System.out.println("");
				break;}

			default:
				System.out.println("");
			}
			if(num==4) {
				break;
			}
			System.out.println();
		}
	}

}
