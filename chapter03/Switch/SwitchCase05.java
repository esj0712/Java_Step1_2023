package chapter03.Switch;

public class SwitchCase05 {

	public static void main(String[] args) {
		
		
		System.out.println(" : ");
		int num=(int)(Math.random()*9)+1;
		
		switch (num) {
		case 1: case 2: case 3: case 4: case 5: case 6:{
			System.out.println(num+ "");
			break;
		}
		default:
			System.out.println("");
		}

	}

}
