package chapter03;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Example01 {

	public static void main(String[] args) {
		
	
		Scanner scan=new Scanner(System.in);

		System.out.println(" : ");
		int soft1=scan.nextInt();
		System.out.println(" : ");
		int soft2=scan.nextInt();
		System.out.println(" : ");
		int DB=scan.nextInt();
		System.out.println(" : ");
		int PRO=scan.nextInt();
		System.out.println(" : "); 
		int OS=scan.nextInt();
		
		int sum=soft1+soft2+DB+PRO+OS;
		
		if(soft1<8 || soft2<8 || DB<8 || PRO<8 || OS<8 || sum<60) {
			System.out.println("");
		}else {
			System.out.println("");
		}
    	
    	
	}
	
}
    	
		
	   
		
		
		

