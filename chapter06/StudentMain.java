package chapter06;

public class StudentMain {

	public static void main(String[] args) {
		// �ʵ带 �̿��Ͽ� set
		
		Student student1=new Student();
		student1.studentName="��ġ";
		student1.address="����� ���α�";
		
		student1.showStudentInfo();
		System.out.println("---------------------------");
		
		//�޼ҵ带 �̿��Ͽ� set
		Student student2=new Student();
		student2.setStudentName("�ڼ�");
		student2.address="��⵵ ����";
		
		student2.showStudentInfo();
		System.out.println("---------------------------");
		
		
		//������ �����ε����� set
		//Student student3=new Student("��ġ��","����� ����");
		
		//student3.showStudentInfo();
		
	}

}
