package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 
		Scanner scan=new Scanner(System.in);
		
		System.out.println("");
		
		int i=scan.nextInt(); 
		int n;
		int s=0;
		
		
		for(n=i; i<=100; i++) {
			s+=n++;
		}
		
		System.out.println("" +s+ "");
		
		
		
		int j;
		int s1=0;
		
		for(j=0; j<=10; j++) {
			System.out.println("");
			j=scan.nextInt();
			if(j==0) {
				continue;
			}
			if(j % 2 == 0) {
				s1+=1;
			}
			System.out.println("" +s1+ "");
		}
		
	}

}
