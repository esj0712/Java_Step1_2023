package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		
		
		int score[]= {98,90,87};
		
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			
			sum += score[i];
			
		}//for
        double avg = sum / score.length; 
        
        System.out.println(" : "+sum+ " | : "+Math.round(avg));
	}//main
            
}//class
