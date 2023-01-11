package chapter03.FOR.Example;

import java.util.Scanner;

public class ExampleWhile03 {

	public static void main(String[] args) {
		
		boolean run=true;
		int num, num2;
		int save=0;
		int money=0;
		
		Scanner scan=new Scanner(System.in);
		
		
		while(run) {
			
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println("-------------------------------");
			System.out.print("> ");
			
			num = scan.nextInt();
			
			if(num==1) {
				System.out.println("");
				System.out.println(""+save);
				System.out.print(" : ");
				money=scan.nextInt();
				save+=money;
				if(money<0)
					System.out.println("");
			}else if(num==2) {
				System.out.println("");
				System.out.println(" : "+save);
				System.out.print(" : ");
				money=scan.nextInt();
				save-=money;
				if(save<0) {
					System.out.println("");
				}
			}else if(num==3) {
				System.out.println("");
				System.out.println(" : "+save);
			}else if(num==4) {
				System.out.println("");
				run=false;
			}else {
			    System.out.println("");
			}
				
			System.out.println("1.");
			
			}
					
	
            
            
	}

}
