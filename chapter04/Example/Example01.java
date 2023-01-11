package chapter04.Example;

public class Example01 {

	public static void main(String[] args) {
        
		int array[][]= { {95,86}, {83,92,96},{78,83,93,87,88} };
		
		
		double avg=0;
		int total=0; 
		int alltotal=0;
		int count=0; 
		
		int sum[]=new int[3];
		
		for(int[] num :array) { //95.86
			for(int score : num) { //95 //86
				total+=score;
			}// I for
			count++;
			System.out.println(count +" : "+total);
			total=0;// 
			
		}// O for
		
//=====================================================================
		/*
		for( int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				System.out.print("["+array[i][j]+ ");
				}
		
		}
		*/
		
	}

}
