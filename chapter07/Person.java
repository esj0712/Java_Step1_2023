package chapter07;

public class Person {
	
	String name;
	float height;
	float weight;
	
	//�⺻ ������
	public Person() {}
	
	//�����ε�  //���ÿ� ��ġ �޸𸮸���**
	public Person(String name) {
		this.name=name;
	}
	public Person(String name,float height,float weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		
	}
}