package chapter03.FOR;

public class ForTest03 {

	public static void main(String[] args) {
		
		System.out.println("1100");
		
		int i;
		int sum=0;
		for(i=1; i<=100; i++) {
			sum+=i;
		    if(sum<100) {
		    	System.out.println(" " +i+ " : " +sum+"");
		    }//if
		}//for

		//2
	    System.out.println("1");
	    
	    int j;
	    int sum1=0;
	    for(j=1;j<=100;j++) {
	    	sum1+=j;
	    	if(sum1>=100)
	    		break;
	    }
	    System.out.println(" : "+(j-1)+"");
	    System.out.println(" "+(j-1)+" : "+(sum1-j)+"");
	    
	    //3
	    System.out.println("");
	    
	    int k;
	    int sum2=0;
	    for(k=1; sum<100; k++) {
	    	sum2+=k;    
	}
	    System.out.println(" : "+(k-1)+"");
	    System.out.println(" "+(k-1)+" : "+sum2+"");
	}
	
}
