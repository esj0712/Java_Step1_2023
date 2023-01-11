package chapter03.FOR.While;

import javax.swing.JOptionPane;

public class WhileTest07 {

	public static void main(String[] args) {
		/*
		int num=1;
		int sum=0;
		
		do {
			sum+=num;
			num++;
		}while(num <=10);
		System.out.println("1 : "+sum);
        */
		
		int num1;
		int num2;
		
		do {
			num1=Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if(num1 == num2) {
				System.out.println("");
				break;
			}
			System.out.println("");
		}while(num1 != num2);
		
		
	}

}
