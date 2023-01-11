package chapter03;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		//num1
		System.out.println(": ");
		double num1=Double.parseDouble(scan.nextLine());
		System.out.println(" : "+ num1);
		System.out.println();

		//num2
		System.out.print("2 : ");
		double num2=Double.parseDouble(scan.nextLine());
		System.out.println(" : "+ num2);
		System.out.println();
		
		
		if(num2 != 0.0) {
			System.out.println(" : " + num1 / num2);
		}else {
			System.out.println("");
		}
	    
		
	}

}
