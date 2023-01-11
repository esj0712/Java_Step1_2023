package chapter04.Example;

import java.util.Random;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
        
		int number;
		int cnt=0;
		int[] lotto=new int[6];
		
		System.out.println("===== ====");
		number=Integer.parseInt(JOptionPane.showInputDialog(""));
		while(number > cnt) {
			System.out.print("["+(cnt+1)+ "] ");
			
			outer : for(int i=0; i<lotto.length;) {
				lotto[i]=new Random().nextInt(45)+1;
				
				
				for(int j=0;j<i; j++) {
					if(lotto[i] == lotto[j]) {
						continue  outer;
					}// if 
				}//in for
					System.out.print(lotto[i]+" ");
					i++;
			}//out for
			cnt++;
			System.out.println();
		}
		
		
	}

}
// =Integer.parseInt(JOptionPane.showInputDialog(""));
//=(int)(Math.random()*5)+1;