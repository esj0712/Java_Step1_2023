package chapter03.FOR;

import java.util.Scanner;

public class Fortest13 {

	public static void main(String[] args) {
		// 
		/*
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i + " * "+j+" = "+(i*j));
			}
			System.out.println("--------------------------");
		}
        */
		
		Scanner scan=new Scanner(System.in);
		System.out.print(" : ");
		int i;
		int num=scan.nextInt();
		
		for(i=1; i<10; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			}
		}
		


}
