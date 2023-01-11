package chapter03.FOR.While;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num;
		String menu = "";
		do 
		{
			
			System.out.print(" : ");
			num = scan.nextInt();
			
			if(num <1 || num>3) {
				
				if(num==4) {
					break;
				}
				menu="";
						
			}else {
			
	
			if(num==1) {
				menu=" ";
			}else if(num == 2) {
				menu=" ";
			}else if(num == 3) {
				menu=" ";
			}else if(num == 4) {
				menu=" ";
			}
			System.out.println(menu+"");
			}
		}while(num != 4);
		
		System.out.println();
		

	}

}
