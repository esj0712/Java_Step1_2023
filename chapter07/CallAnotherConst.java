package chapter07;

class Person2{
	
	 String name;
	 int age;
	 
	 
	
	 public void Person2() {
		 //this.("�̸�����", 0); //Person2(String str, int a);
	 }
	 
	 public void Person2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	 //�ڱ��ڽ��� �ּ�
	 Person2 returnSelf() {
		 return this;
	 }
}

public class CallAnotherConst {
	

	
	public static void main(String[] args) {
		Person2 noName=new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName�� �ּ� : "+noName);
		//noName�� p�� ��ü�� ���� �ٸ������� �Ҵ�
		System.out.println("----------------------------");
		Person2 p=new Person2();
		System.out.println("p�� �ּ� : "+p);
		//�ּ� ����
		System.out.println("----------------------------");	
		Person2 person=noName.returnSelf();
		System.out.println(person);
		System.out.println(noName);

	}

}
