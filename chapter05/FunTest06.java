package chapter05;

public class FunTest06 {
	
	public String channel; //
	public int channelInt; // **
	public int volume;     //
	
	
	
	//void 
	
	public int channelup(int volume) {
		this.volume=volume;
	    System.out.println("");
		return volume+2;
		//
	}
	//  
	public void channelDown(int volume) {
		this.volume=volume;
	    System.out.println("");
	}

	public static void main(String[] args) {

		FunTest06 tv= new FunTest06();
		
		
		
		
		int volume=tv.channelup(9);//11
		System.out.println("");
	}

}
