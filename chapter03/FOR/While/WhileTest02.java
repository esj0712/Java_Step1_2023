package chapter03.FOR.While;

public class WhileTest02 {

	public static void main(String[] args) {
		/*
		int i=1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("");
		*/
		
		int num=1;
		int sum=0;
		
		while(num<=10){
			
			sum+=num;
	        num++;
		}
		System.out.println(" : "+ num);
		System.out.println(" : "+ sum);
	}//main

}//class
