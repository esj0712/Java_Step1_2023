package chapter06;

public class Student {

	//�ʵ�
	int studentID;
	int grade;
	public String studentName;
	String address;
	


	//����Ʈ ������(free compile)
	//�����ε��� �����ڰ� ���� �� ����Ʈ�� ����ϱ� ���ؼ��� �ݵ�� ����Ѵ�.(�����Ұ�)
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
