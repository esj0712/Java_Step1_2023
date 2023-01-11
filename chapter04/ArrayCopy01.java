package chapter04;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int array1[]= {10,20,30,40,50};
		int array2[]= {1,2,3,4,5};
		
		for( int i=0; i<array1.length; i++) {
			System.out.print(array1[i]+" ");
			
		}//for
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
		for( int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
			
		}//for
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		
		
	    System.arraycopy(array1, 0, array2, 1, 4);
	                  
		for( int i=0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
			
		}
		
	}//main

}//class
