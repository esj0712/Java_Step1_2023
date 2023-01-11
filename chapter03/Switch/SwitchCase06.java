package chapter03.Switch;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 
		int time=(int)(Math.random()*10)+9;
		System.out.println("[ : "+time+ "]");
		System.out.println(" : ");
		
		switch (time) {
		case 9:
			System.out.println("");
			break;
		case 10: case 11: case 13: case 14: case 15: case 16: case 17: case 18:
			System.out.println("");
			break;
		case 12:
			System.out.println("");
			break;
		default:
			System.out.println("");
		}

	}//main

}//class
