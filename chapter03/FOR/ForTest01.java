package chapter03.FOR;

public class ForTest01 {

	public static void main(String[] args) {
		// 1
		/*
		int sum=1;
		
		//sum = sum+2;
		sum +=2;
		sum +=3;
		sum +=4;
		sum +=5;
		sum +=6;
		sum +=7;
		sum +=8;
		sum +=9;
		sum +=10;
		
		System.out.println(sum);
        */
		int i;
		System.out.println("1");
		
		for(i=2; i<=10; i++) {
			
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=================================");
		
		int j; //Index 
		int sum=0;
		
		for(j=1; j<=10; j++) {
		    System.out.println(j + " ");
		    sum+=j;
		}
		System.out.println();
		System.out.println("1 : " + sum + "");
	}

	
}
