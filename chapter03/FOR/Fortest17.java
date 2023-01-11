package chapter03.FOR;

import java.util.Scanner;

public class Fortest17 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("> ");
		int n = scan.nextInt();
		
		int i, j;
		
		for( i=0; i<n; i++)
		{//
			for( j=0; j<=n-1-i; j++)
			{
				System.out.print(" ");
			}
			//
			for( j=0; j<2*i+1; j++)
			{
				System.out.print("");
			}
			System.out.println();
		}
			
	}

}