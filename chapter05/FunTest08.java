package chapter05;

public class FunTest08 {

	
	public static int Recur(int a) {
		
		int result;
		System.out.print(a + " ");
		
		if(a==1) {
			return(1);
		}else {
			result=a*Recur(a-1);
		}
		
		  
	    return result;
	}
	
	public static void main(String[] args) {

		int x=5;
		
		System.out.println("");
		int res=Recur(x);
		System.out.println();
		System.out.println("1 ~ "+ x + ": "+res);
		
	}

}
