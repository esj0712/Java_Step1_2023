package chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		
		int a[]=new int[5]; //Fixed-length
		
		
		int b[]; 
		b=new int[5]; 
		
		int aVal;
		int bVal;
		int Tot;
		
		
		args=new String[2];
	    args[0]="1"; 
	    args[1]="2"; 	
		
		String[] str;
		str=new String[10];
		
		
		if(args.length == 2 ) {
			int sum=0; 
			aVal=Integer.parseInt(args[0]); 
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal=0;
			bVal=0;
		}
		
		Tot=aVal+bVal;
		System.out.println(Tot);

	}//main

}//class
