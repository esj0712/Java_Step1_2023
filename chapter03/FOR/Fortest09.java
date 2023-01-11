package chapter03.FOR;

import java.util.Scanner;

public class Fortest09 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int i;
		int sum=0, cnt=0;
		double avg=0;
		
		System.out.println(" ");
		int stu=scan.nextInt();
		
		for (i=1; i<=stu; i++) {
		     System.out.println(i+"");
		     int sco=scan.nextInt();
		     sum=sco;
		     cnt++;
		}
		   
			avg=sum/cnt;   
			   System.out.println(" : "+sum+ ",  : "+avg);
		   
		   				
	}

}
