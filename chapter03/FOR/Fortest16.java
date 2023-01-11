package chapter03.FOR;

public class Fortest16 {

	public static void main(String[] args) {
		
		for(int i=2; i<=9; i++) {
			System.out.print("["+i+"�떒"+"]"+"\t");
		}
        for(int A=1; A<=9; A++) { 
        	System.out.println();
        	for(int B=2; B<=9; B++) {
        		System.out.print(B+"*"+A+"="+(A*B)+"\t");
        		
        	}
        }
	}

}
