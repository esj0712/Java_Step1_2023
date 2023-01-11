package chapter05;

import javax.swing.JOptionPane;

public class FunTest04 {
	
	public static void Display(String A[]) {
		String res="";
		
		for(int i=0; i<A.length; i++) {
			res +=A[i]+"";
			
		}//for
		
		System.out.println(res);
		JOptionPane.showMessageDialog(null, ""+res);
	}

	public static void main(String[] args) {
		String str[]= {"Java ", "Oracle ", "Jsp ", "Html5, Css,Js ,Jq ", "SprintBoot", " PythonCamp"};
		
		Display(str);
		

	}

}
