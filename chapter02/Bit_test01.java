package chapter02;

public class Bit_test01 {

	public static void main(String[] args) {
		// Bit 
		
		int num1=2; // 0010
		int num2=10; // 1010
		
		
	    //Bit OR(|)
		int result=num1 | num2;
		System.out.println(result);
				
		//Bit AND(&)
		result=num1 & num2;
		System.out.println(result);
		
		//Bit AND(^)
	    result=num1 ^ num2;
	    System.out.println(result);

	}

}
