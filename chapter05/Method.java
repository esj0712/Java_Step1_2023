package chapter05;

import java.util.Scanner;

public class Method {

	
	
	void makebread() {
		System.out.println("빵을 만듭니다");
		
	}//method1
	void makebread(int count) {
		System.out.println("");
		//1번째 빵을 만듭니다
		//2번째 빵을 만듭니다
        for(int i=0; i<count; i++) {
			
			System.out.println((i+1)+"");
			
		}
        
        
        System.out.println(""+count+"");
	}//method2
	
	void makebread(int count, String str) {
		System.out.println(count+""+str+" ");
	}//Method3
	
	void order() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. | 2.  | 3.");
		}
		
		
	}
			
			
			
			
			
		
	
	

		
					
}
		        
		
		
		
			
	
	//void order() {
		
	
	

