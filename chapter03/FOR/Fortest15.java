package chapter03.FOR;

import java.util.Scanner;

public class Fortest15 {

	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		
        int i, j;
		System.out.print(" : ");
        int a=scan.nextInt();
        System.out.print(" : ");
        int b=scan.nextInt();
        
		for(i=1; i<=a; i++) {
			for(j=1; j<=b; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();//

	     }
	}
}
