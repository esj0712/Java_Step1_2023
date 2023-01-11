package chapter03.FOR.While;

public class WhileTest01 {

	public static void main(String[] args) {

        while(true) {
        	
        	int num=(int)(Math.random()*6+1);
        	System.out.println(" : "+ num);
        	
        	if(num==6) {
        		break;
        	}//if
        	
        }//while
        
        System.out.println("");

	}

}
