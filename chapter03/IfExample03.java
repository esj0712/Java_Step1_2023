package chapter03;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {


		char grade;
		int jumsu;

		jumsu = Integer.parseInt(JOptionPane.showInputDialog("java "));
		/*
		 * 
		 * 
		 * if(jumsu >= 90) 
		 *      System.out.println('A'); 
		 * else if(jumsu >= 80) 
		 * System.out.println('B'); 
		 * else if(jumsu >= 70) 
		 * System.out.println('C'); 
		 * else if(jumsu >= 60) 
		 * System.out.println('D'); 
		 * else                 
		 *System.out.println('F');
		 * 
		 */

		// 방법2
		if (jumsu >= 90) {
			grade = 'A'; // 
			System.out.println("");
		} else if (jumsu >= 80) {
			grade = 'B'; // 
			System.out.println("");
		} else if (jumsu >= 70)
			grade = 'C';
		else if (jumsu >= 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println(" : " + grade + "");

		} //main

}//class
