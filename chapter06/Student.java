package chapter06;

public class Student {

	//필드
	int studentID;
	int grade;
	public String studentName;
	String address;
	


	//디폴트 생성자(free compile)
	//오버로딩된 생성자가 있을 시 디폴트를 사용하기 위해서는 반드시 명시한다.(생략불가)
	public void student() {
		
	}
	
	
   public void student(String studentName , String address) {
		this.studentName=studentName;
	this.address=address;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName+ ", "+address);
	}
	
	
}
