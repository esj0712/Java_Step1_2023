package chapter04;

import javax.swing.JOptionPane;

public class TowDimnsion02 {

	public static void main(String[] args) {

		int JavaScore[][]=new int[2][3];
		;
		
		for(int i=0; i < JavaScore.length; i++) {
			for(int j=0; j < JavaScore[i].length; j++) {
				//
				int z=Integer.parseInt(JOptionPane.showInputDialog("�젏�닔"));
				//
				JavaScore[i][j]=z;
				System.out.println("Javascore["+i+"]"+"["+j+"]"+JavaScore[i][j]);
			}
			System.out.println();
			
		}
		
	}

}
