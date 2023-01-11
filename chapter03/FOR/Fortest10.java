package chapter03.FOR;

import java.util.Scanner;

public class Fortest10 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int i, sum=0;
		
		System.out.print(" : "); 
		int num=scan.nextInt();
		
		for(i=1; ;i++) {
			
			if(sum>num) {
				break;
			}
			sum+=i;
		}
        System.out.println(i-1+" : "+sum);    
	}

}
