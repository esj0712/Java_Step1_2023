package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int i; 
		System.out.print(" : ");
		int a=scan.nextInt();
		
		
		if(a>0 && a<11) {
			for(i=1; i<=a; i++) {
				System.out.println("Java");
			}//for
			
		}else {
			System.out.println("");
		}//if
		
		System.out.println("");
	}//main

}//class
