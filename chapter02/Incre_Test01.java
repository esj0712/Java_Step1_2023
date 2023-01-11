package chapter02;

public class Incre_Test01 {

	public static void main(String[] args) {
		
		int a, b, c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a : "+(++a)); // a=a+1 => a+=1
		System.out.println("a++ : "+(a++)); // a=a  => a=a+1
        //                              <<<<<<<<<<<<<<<<<
		System.out.println(" : "+ a ); // 12
		System.out.println("===================="); 
		System.out.println("c++: " + (c++)); // 3 
		System.out.println("" + c); // 4 
		 
		System.out.println("====================");
        //
		//#1
	    System.out.println("++a + b++ :" + (++a + b++));// 13+20 = 33
	    System.out.println(": " + b); // 21
	    System.out.println("====================");
	    
	    //#2
	    System.out.println("++a :" + (++a)); // 14
	    System.out.println("b++ :" + (b++)); // 21
	    System.out.println(" "+ b );
	    System.out.println("++a + b++ : "+ (++a + b++) ); // 15+22 = 37
	    System.out.println(" : " + b); // 23
	    
	    
	    
	}

}
