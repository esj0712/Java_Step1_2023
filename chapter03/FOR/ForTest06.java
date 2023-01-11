package chapter03.FOR;

public class ForTest06 {

	public static void main(String[] args) {
		
		int i;
		char a='A'; //ASCII CODE : 65
		// String => char => charAt(0)
		// i=a; ()  a=i; ()
		
		for(i=a; i<='Z'; i++) {
			System.out.printf("%c ", i);
		}//for
		

	}//main

}//class
