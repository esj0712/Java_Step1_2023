package chapter03.FOR.While;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num;
		int cnt=0, sum=0;
		double avg;
		
		//
	    while(true) {
	        System.out.println("");
	        
	        num=scan.nextInt();
	        if(num==0) {
	        	break;
	        }
	        
	        cnt++;
	        sum+=num;
	    	
	    }

	    System.out.println(" : "+cnt);
	    System.out.println(" : "+sum);
	    System.out.println(" : "+sum/(double)cnt);
	    
	}

}
