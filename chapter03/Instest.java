package chapter03;

// �궡遺� �겢�옒�뒪
class clsA{
	
	void fun() {
		System.out.println("2023");
	}//fun
}//clsA

class clsB extends clsA {
	
}//clsB
//=================================================

public class Instest {

	public static void main(String[] args) {
		//clsB
		clsB objB=new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("Yes");
			objB.fun();
		}//if

		if(objB instanceof clsB) {
			System.out.println("Yes");
		}//if
		
	}//main

}//Instest 
