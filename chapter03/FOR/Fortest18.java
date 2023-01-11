package chapter03.FOR;

import java.util.Scanner;

public class Fortest18 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print(": ");
		int i, j;
		int n = scan.nextInt();
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("");
			}
			System.out.println();
		}
		
	}

}
