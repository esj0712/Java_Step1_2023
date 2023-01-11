package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {

		
		Book bookArray1[]= new Book[3];
	
		Book bookArray2[]= new Book[3];
		
	
		bookArray1[0]= new Book("","");
		bookArray1[1]= new Book("","A");
		bookArray1[2]= new Book("","B");
		
		System.out.println("======(bookArray1)======");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}
		//복사
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);;
		
		System.out.println("======(bookArray2)======");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].showBookinfo();	
		}
//===================================================================
		
		bookArray1[0].setBookname("");
		bookArray1[0].setAuthor("");
		
		System.out.println("======(bookArray1)======");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookinfo();
		}	
		System.out.println();
		System.out.println("======(bookArray2)======");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookinfo();
			
		}	
//===================================================================			
	}

}
