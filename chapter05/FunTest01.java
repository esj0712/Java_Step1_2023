package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {
	
	
	public static void main(String[] args) {
		
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("2"));
		
		
		FunTest02 Obj=new FunTest02();
		

	}
	//main
	public static void sum(int num1,int num2) {
		//int num1=2;
		//int num2=3;
		int total=num1+num2;
		System.out.println(total);
	}
}
