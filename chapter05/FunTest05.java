package chapter05;

public class FunTest05 {
	
	public String channel; 
	public int channelInt; 
	public int volume; 
	
	public void chUp(int volume) {
		System.out.println("");
	}
	public void chDown(int volume) {
		System.out.println("");
		
	}
	
	public void chChange(String channel) {
		System.out.println("");
	}
	
    public void chChange(int channelInt) {
    	System.out.println("");
		
	}
    

//===================================================	
	public static void main(String[] args) {
		
		FunTest05 tv= new FunTest05();
		
		tv.chUp(3);
		tv.chDown(5);
		tv.chChange("Tvn");
		tv.chChange(5);

	}//main

}
