package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int a, cnt3=0, cnt5=0;
		System.out.print(" : ");
		
		a=scan.nextInt();
		for(a=1; a<=10; a++) {
			if (a % 3 == 0) {
				//System.out.print("3 : " + a);
				cnt3++;
			}
			      System.out.println();
		}
            if (a % 5 == 0) {
			   //System.out.print("5 : " + a);
			    cnt5++;
		}
		
	    System.out.println(" : " + cnt3 + "");
	    System.out.println(" : " + cnt5 + "");
	}

}
