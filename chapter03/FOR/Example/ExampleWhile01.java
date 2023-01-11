package chapter03.FOR.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int num;
		int cash;
		int balance=0;
		
		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("");
			System.out.println("-----------------------------");
			System.out.print("");
			num=scan.nextInt();
			cash=scan.nextInt();
			
			switch (num) {
			
			case 1:{
				System.out.println("> "+cash);
				balance+=cash;
				if(cash<=0) {
					System.out.println("");
				}
				break;}
			case 2:{
				System.out.println("> "+cash);
				balance-=cash;
				if(balance<cash) {
					System.out.println("");
				}
				break;}
			case 3:
				System.out.println(" > "+balance);
				break;
			case 4:
				run=false;
				System.out.println("");
				break;
			
			default:
				System.out.println("");
				break;
			 }
			
			}//while
			
			
		}//main

	}//class


