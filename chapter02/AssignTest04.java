package chapter02;

public class AssignTest04 {

	public static void main(String[] args) {
		
		int gameScore=150;
		
		
		System.out.println("==========");
		int lastScore1=++gameScore; 
		System.out.println(lastScore1); //151
		System.out.println(gameScore);
		
		System.out.println("================");
		int lastScore2=--gameScore; //
		System.out.println(lastScore2); //150
		System.out.println(gameScore);
		
		// 
		System.out.println("==========");
		int lastScore3=gameScore++; // 
		System.out.println(lastScore3); 
		System.out.println(gameScore); 
		
		System.out.println("================");
		int lastScore4=gameScore--; //
		System.out.println(lastScore4);
		System.out.println(gameScore);
		

	}

}
