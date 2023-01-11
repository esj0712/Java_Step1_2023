package chapter03.Switch;

import java.util.Scanner;

public class SwitchCase03 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
		int mon;
		int day;
		
		System.out.print("(1~12) : ");
		mon=scan.nextInt();
		
		switch (mon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day=31;
			break;
		case 2:
			day=28;
			break;
		case 4: case 6: case 9: case 11:
			day=30;
			break;
			
		default:
			day=0;
			System.out.println("");
		}//switch
		
        System.out.println(mon + " " + day +  "");
		
	}//main

}//class
