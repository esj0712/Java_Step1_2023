package chapter06;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo studentKim=new StudentInfo();
		
		System.out.println();
		
		
		studentKim.studentID=1004;
		studentKim.grade=3;
		studentKim.address="����� ���α�";
		
	    studentKim.setStudentName("ȫ�浿");
	    String name=studentKim.getStudentName();
	    
	    System.out.println(name);
		

	}

}
