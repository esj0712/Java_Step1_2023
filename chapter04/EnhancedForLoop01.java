package chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {

		String strArray[]= {"Java","Oracle","Html5,CSS,JS,JO","JSP","Spring","PythonCamp"};
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("==============================");
		
		for(String lang:strArray) {
			System.out.println(lang);
		}
		
	}

}
